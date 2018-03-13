package com.cn.eric.data.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DijKstra<Weight extends Number> {
	
	private WeightSparseGragh gragh;
	private boolean[] isChecked;
	private int s;
	private List<Weight> distTo;
	private List<Edge> list;
	
	
	/*
	 * 1.	记录source到每个顶点的最小距离
	 * 2.	记录source到每个顶点的具体路径
	 * 
	 * 思路：
	 * 
	 * 1.	维护长度为V的数组，source不予考虑。其他代表source到其他顶点的最小距离
	 * 2.	首先用将source相关的线挑出，插入到对应数组位置。最小的一个则为到该节点最小的距离。一个顶点固定了
	 * 3.	继续选择最小的边的那个顶点，然后遍历其所有临边，看到对应节点的权值+自己的权值是否小于source到其的值。如果小则更新。from数组表示从从哪个顶点来的
	 * 4.	以此类推。distTo数组来计算总共的权值。
	 * 5.	可以用最小索引堆来完成最小值的操作。
	 */
	public DijKstra(WeightSparseGragh g,int source){
		assert source>=0&&source<=this.gragh.getVnum();
		
		this.gragh = g;
		this.s = source;
		isChecked = new boolean[this.gragh.getVnum()];
		//用于维护0~(vNum-1)的最小权值信息
		distTo = new ArrayList<Weight>();
		//用于维护0~(vNum-1)的from信息
		list = new ArrayList<Edge>();
		
		for(int i=0;i<isChecked.length;i++){
			isChecked[i] = false;
			distTo.add(null);
			list.add(null);
		}
		
		//Dijkstra
		//以source为起点，所以isChecked以及
		List<Edge> temp = this.gragh.getConnectedEdges(source);
		for(Edge e:temp){
			list.set(e.other(source), e);
			distTo.set(e.other(source), (Weight) e.getWt());
		}
		isChecked[source] = true;
		
		while(!allChecked(isChecked)){
			int s = findRemainingMin(list);
			isChecked[s] = true;
			temp = this.gragh.getConnectedEdges(s);
			for(Edge e:temp){
				int next = e.other(s);
				if(next == source || isChecked[next])
					continue;
				if(list.get(next)==null){
					list.set(next, e);
					distTo.set(next, (Weight) e.getWt());
					continue;
				}
				//松弛操作
				double newValue = distTo.get(s).doubleValue()+e.getWt().doubleValue();
				if(newValue-distTo.get(next).doubleValue()<0){
					list.set(next, e);
				}
				distTo.set(next, (Weight)((newValue-distTo.get(next).doubleValue())>0?newValue:distTo.get(next)));
			}
		}
	}
	
	public Weight getShortestWeight(int targetV){
		return distTo.get(targetV);
	}
	
	public List<Integer> getShortestPath(int targetV){
		List<Integer> target = new ArrayList<Integer>();
		
		if(targetV==this.s)
			return null;
		
		target.add(targetV);
		int source = this.list.get(targetV).other(targetV);
		
		while(source!=this.s){
			target.add(source);
			source = this.list.get(source).other(source);
		}
		
		target.add(this.s);
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

	private boolean allChecked(boolean[] isChecked2) {
		for(int i=0;i<isChecked2.length;i++)
			if(isChecked2[i]==false)
				return false;
		return true;
	}

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
		
		int source=0;
		DijKstra<Double> dij = new DijKstra<Double>(gragh,source);
		
		for(int i=0;i<vNum;i++){
			if(i==source)
				continue;
			StringBuffer sb = new StringBuffer();
			sb.append("Shortest Path:").append(dij.getShortestWeight(i)).append("\t");
			for(Integer j:dij.getShortestPath(i)){
				sb.append(j).append("->");
			}
			System.out.println(sb.substring(0,sb.lastIndexOf("->")));
		}
		
		
	}

}
