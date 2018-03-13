package com.cn.eric.data.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WeightSparseGragh {
	
	private List<Edge> v;
	private int[] from;
	private int[] route;
	private boolean[] isChecked;
	private int count;
	
	public WeightSparseGragh(int vNum,List<Edge> edges){
		this.count = vNum;
		this.isChecked = new boolean[vNum];
		this.v = edges;
		for(int i=0;i<vNum;i++)
			isChecked[i] = false;
	}
	
	public int getVnum(){
		return count;
	}
	
	/*
	 * 返回节点有关的连接线
	 */
	public List<Edge> getConnectedEdges(int node){
		List<Edge> list=null;
		if(node>=0&&node<count){
			list = new ArrayList<Edge>();
			for(Edge edge:this.v){
				if(edge.isInEdge(node))
					list.add(edge);
			}
		}
		return list;
	}
	
	/*
	 * 返回节点有关的连接线
	 */
	public List<Edge> getConnectedDirectedEdges(int source){
		List<Edge> list=null;
		if(source>=0&&source<count){
			list = new ArrayList<Edge>();
			for(Edge edge:this.v){
				if(edge.isSourceNode(source))
					list.add(edge);
			}
		}
		return list;
	}
	
	/*
	 * 假设只有一个联通分量
	 * 复杂度:O(ElogE)
	 * 利用最小堆来实现，遍历所有边
	 */
	public List<Edge> lazyPrime(){
		List<Edge> list = new ArrayList<Edge>();
		
		//最小堆
		MinHeap<Edge> minHeap = new MinHeap<Edge>(this.v.size()*this.v.size());
		
		//插入第一个节点的相关线路进入最小堆
		int index = 0;
		List<Edge> temp = this.getConnectedEdges(index);
		minHeap.insertCol(temp);
		isChecked[index] = true;
		
		
		while(!minHeap.isEmpty()){
			Edge e = minHeap.extractMin();
			//两边被检查过了则不是横切边
			if(isChecked[e.getFrom()]&&isChecked[e.getTo()])
				continue;
			index = isChecked[e.getFrom()]?e.getTo():e.getFrom();
			isChecked[index] = true;
			list.add(e);
			
			temp = this.getConnectedEdges(index);
			minHeap.insertCol(temp);
		}
		
		return list;
	}
	
	/*
	 * 假设只有一个联通分量
	 * 
	 * 复杂度 O(ElogV)
	 * 
	 * 1.	利用一个数组来保存相关的最小横切边，思路类似于最小索引堆
	 * 2.	每次寻找数组中最小的索引，遍历相关的横切边，然后更新数组，最小值即为target,设置check之后，再去遍历，知道最后所有都check过了
	 */
	public List<Edge> optimizedPrime(){
		for(int i=0;i<isChecked.length;i++)
			isChecked[i]=false;
		
		//索引数组
		List<Edge> list = new ArrayList<Edge>();
		for(int i=0;i<count;i++)
			list.add(null);
		//n个顶点,n-1条边,每个数据存的是当前循环中剩余节点所对应的横切边最小值。
		//index=0不用
		
		int index = 0;
		List<Edge> temp = this.getConnectedEdges(index);
		isChecked[index] = true;
		//将第一个顶点的数据存进去
		for(int i=0;i<temp.size();i++)
			list.set(temp.get(i).other(index), temp.get(i));
		while(!allChecked()){
			index = findRemainingMin(list);
			isChecked[index]=true;
			temp = this.getConnectedEdges(index);
			for(int i=0;i<temp.size();i++){
				int next = temp.get(i).other(index);
				if(next==0||isChecked[next])
					continue;
				if(list.get(next)==null){
					list.set(next, temp.get(i));
					continue;
				}
				list.set(next, temp.get(i).compareTo(list.get(next))<0?temp.get(i):list.get(next));
			}
		}

		//将最开始的0 remove掉
		list.remove(0);
		return list;
	}
	
	
	/*
	 * 假设只有一个联通分量，寻找最小生成树
	 * 
	 * 复杂度:O(ELog(E))
	 * 
	 * 1.	排序所有边
	 * 2.	挨个遍历，如果增加的边和已经选择的边没有形成环(因为最小生成树不可能有环)，则增加该边，否则不增加。直到所有顶点遍历完成
	 */
	
	@SuppressWarnings("rawtypes")
	public List<Edge> krusk(){
		for(int i=0;i<isChecked.length;i++)
			isChecked[i]=false;
		List<Edge> target = new ArrayList<Edge>();
		
		Collections.sort(this.v);
		
		UnionSet us = new UnionSet(count);
		
		for(Edge e:this.v){
			boolean finish = true;
			if(!us.isConnected(e.getFrom(), e.getTo())){
				target.add(e);
				us.union(e.getFrom(), e.getTo());
				isChecked[e.getFrom()]=true;
				isChecked[e.getTo()] = true;
				for(int i=0;i<count;i++){
					if(!us.isConnected(0, i))
						finish = false;
				}
				if(finish)
					break;
			}
		}
		
		return target;
	}
	

	private int findRemainingMin(List<Edge> list) {
		int index = -1;
		for(int i=1;i<list.size();i++){
			//给第一个不为null的值
			if(index==-1&&list.get(i)!=null&&isChecked[i]!=true){
				index = i;
				continue;
			}
			if(index!=-1&&list.get(i)!=null&&list.get(index).compareTo(list.get(i))>0&&isChecked[i]!=true)
				index = i;
		}
		return index;
	}

	private boolean allChecked() {
		for(int i=0;i<isChecked.length;i++)
			if(!isChecked[i])
				return false;
		return true;
	}

	public void printEdges(){
		for(Edge edge:this.v){
			System.out.println(edge.getFrom()+"-->"+edge.getTo()+" weight:"+edge.getWt());
		}
	}
	
	
	
	private static class MinHeap<K extends Comparable>{
		private List<K> list;
		private int count;
		private int capacity;
		
		public MinHeap(int capacity){
			this.capacity = capacity;
			list = new ArrayList<K>(capacity+1);
			for(int i=0;i<=capacity;i++)
				list.add(null);
			this.count=0;
		}
		
		public MinHeap(List<K> list){
			this.list = new ArrayList(list.size()+1);
			capacity = list.size();
			this.count = list.size();
			this.list.add(null);
			for(int i=0;i<list.size();i++){
				this.list.add(list.get(i));
			}
			for(int i=count/2;i>=1;i--){
				shiftDown(i);
			}
		}
		
		public K extractMin(){
			if(count==0)
				return null;
			if(count==1){
				count--;
				return list.get(1);
			}
			K target = list.get(1);
			
			list.set(1,list.get(count));
			
			count--;
			
			shiftDown(1);
			
			return target;
		}
		
		public void insert(K k){
			count++;
			list.set(count,k);
			shiftUp(count);
		}
		
		public void insertCol(Collection<K> col){
			if(col ==null)
				return;
			for(K k:col){
				insert(k);
			}
		}
		
		private void shiftUp(int pos) {
			while(pos>1&&list.get(pos/2).compareTo(list.get(pos))>0){
				swap(pos/2,pos);
				pos = pos/2;
			}
		}

		@SuppressWarnings("unchecked")
		private void shiftDown(int pos) {
			if(2*pos<=count){
				int j = 2*pos;
				if((j+1)<=count&&this.list.get(j+1).compareTo(this.list.get(j))<0)
					j = j+1;
				if(this.list.get(pos).compareTo(list.get(j))>0){
					swap(pos,j);
					shiftDown(j);
				}
			}
		}

		private void swap(int pos, int j) {
			K k = this.list.get(pos);
			list.set(pos, list.get(j));
			list.set(j, k);
			
		}
		
		public boolean isEmpty(){
			return count==0;
		}
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		int vNum = 7;
		List<Edge> list = new ArrayList<Edge>();
		Random ran = new Random(System.currentTimeMillis());
		for(int i=0;i<vNum*2;i++){
			int from = Math.abs(ran.nextInt())%vNum;
			int to = Math.abs(ran.nextInt())%vNum;
			double weight = ((int)(Math.abs(ran.nextDouble())*100));
			Edge edge = new Edge(from,to,weight);
		
			//防止a->b 0.1, b->a 0.2的情况
			boolean isMatch = false;
			for(Edge e:list){
				if(e.getFrom()==edge.getTo()&&e.getTo()==edge.getFrom())
					isMatch = true;
				if(e.getFrom()==edge.getFrom()&&e.getTo()==edge.getTo())
					isMatch = true;
			}
			if(isMatch)
				continue;
			
			//防止自己连接自己以及随机造数产生的同样起始点，不同权值的问题
			if(from==to||list.contains(edge))
				continue;
			list.add(edge);
		}
		
		
		WeightSparseGragh gragh = new WeightSparseGragh(vNum,list);
		gragh.printEdges();
		
		
		System.out.println("lazy Prime:");
		List<Edge> edges = gragh.lazyPrime();
		Collections.sort(edges);
		for(Edge edge:edges){
			System.out.println(edge.getFrom()+"-->"+edge.getTo()+" weight:"+edge.getWt());
		}
		
		System.out.println("optimized Prime:");
		edges = gragh.optimizedPrime();
		Collections.sort(edges);
		for(Edge edge:edges){
			System.out.println(edge.getFrom()+"-->"+edge.getTo()+" weight:"+edge.getWt());
		}
		
		System.out.println("Krust algorithm:");
		edges = gragh.krusk();
		for(Edge edge:edges){
			System.out.println(edge.getFrom()+"-->"+edge.getTo()+" weight:"+edge.getWt());
		}
	}
}
