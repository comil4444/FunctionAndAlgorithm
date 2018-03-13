package com.cn.eric.data.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BellmanFord<Weight extends Number> {

	private WeightSparseGragh gragh;
	private boolean[] isChecked;
	private int s;
	private List<Weight> distTo;
	private List<Edge> list;
	private boolean hasNegativeLoop;
	
	/*
	 * 可以有负权边
	 * 
	 * 求取带权有向图中原点s到各个顶点的最小路径
	 * 
	 * 为什么是有向图？
	 * 因为如果是无向图，A->B是负权，那么B->A也是负权，则形成了负权环。永远不会有最小
	 * 
	 * 思路：
	 * 由于从s出发，最多经过V-1条边得到最小路径。因为如果多了，则说明某个顶点访问多次，则存在负权环。
	 * 
	 * 维护数组distTo，表示权值
	 * 1.	遍历distTo第一次，取到与S相邻的边，得到通过一条边到各个顶点的最小值,更新distTo。
	 * 2.	遍历distTo第二次，取到与非null节点的相邻边，然后的到通过两条边到各个顶点的最小，更新distTo。
	 * 3.	遍历V-1次，取到非null节点的相邻边，然后得到通过V-1条边到各个顶点的最小，更新distTo.
	 * 截止
	 * 
	 *  判断是否有负权边？
	 *  在进行一次遍历，看是否有distTo可以被更新，如果有则说明有负权边
	 *
	 */
	
	public BellmanFord(WeightSparseGragh gragh,int source){
		assert source>=0&&source<=this.gragh.getVnum();
		
		this.gragh = gragh;
		this.s = source;
		
		//默认没有负权环
		hasNegativeLoop = false;
		
		//用于维护0~(vNum-1)的最小权值信息
		distTo = new ArrayList<Weight>();
		//用于维护0~(vNum-1)的from信息
		list = new ArrayList<Edge>();
		
		for(int i=0;i<this.gragh.getVnum();i++){
			distTo.add(null);
			list.add(null);
		}
		
		//bellmanford
		//第一次循环
		List<Edge> temp = this.gragh.getConnectedDirectedEdges(source);
		for(Edge e:temp){
			int next = e.other(source);
			distTo.set(next, (Weight) e.getWt());
			list.set(next, e);
		}
		
		//循环V-2次，得到最多通过V-1条边获取的最小路径值
		for(int i=2;i<distTo.size();i++){
			//遍历每个节点
			for(int j=0;j<distTo.size();j++){
				if(distTo.get(j)==null)
					continue;
				//获取原点是j的相邻边
				temp = this.gragh.getConnectedDirectedEdges(j);
				for(Edge e:temp){
					//边的终点
					int next = e.other(j);
					if(next==this.s)
						continue;
					if(distTo.get(next)==null){
						if(j==source){
							distTo.set(next, (Weight) e.getWt());
						}else{
							distTo.set(next, (Weight) (1==1?(e.getWt().doubleValue()+distTo.get(j).doubleValue()):distTo.get(j)));
						}
						list.set(next, e);
						continue;
					}
					//从j->next的距离+distTo[j]的距离小于distTo[next]的距离，则更新
					double newWeight = distTo.get(j).doubleValue()+e.getWt().doubleValue();
					double orginalWeight = distTo.get(next).doubleValue();
					if(newWeight<orginalWeight){
						list.set(next, e);
						distTo.set(next, (Weight)((newWeight-orginalWeight)<0?newWeight:distTo.get(next)));	
					}
				}
			}
		}
		
		distTo.set(source, null);
		
		for(int j=0;j<distTo.size();j++){
			//获取原点是j的相邻边
			temp = this.gragh.getConnectedDirectedEdges(j);
			for(Edge e:temp){
				//边的终点
				int next = e.other(j);
				if(distTo.get(j)==null||next==this.s)
					continue;
				//从j->next的距离+distTo[j]的距离小于distTo[next]的距离，则更新
				double newWeight = distTo.get(j).doubleValue()+e.getWt().doubleValue();
				double orginalWeight = distTo.get(next).doubleValue();
				if(newWeight<orginalWeight){
					hasNegativeLoop = true;
				}
			}
		}
	}
	
	public boolean hasNegativeLoop(){
		return this.hasNegativeLoop;
	}
	
	public Weight getShortestWeight(int targetV){
		if(targetV==this.s&&hasNegativeLoop)
			return null;
		return distTo.get(targetV);
	}
	
	public List<Integer> getShortestPath(int targetV){
		List<Integer> target = new ArrayList<Integer>();
		
		if(targetV==this.s||this.hasNegativeLoop)
			return null;
		
		target.add(targetV);
		int source = this.list.get(targetV).other(targetV);
		
		while(source!=this.s){
			target.add(source);
			source = this.list.get(source).other(source);
		}
		
		target.add(this.s);
		Collections.reverse(target);
		return target;
	}
	
	
	
	public static void main(String[] args) {
		int vNum = 7;
		int mul = 4;
		List<Edge> list = new ArrayList<Edge>();
		Random ran = new Random(System.currentTimeMillis());
		for(int i=0;i<vNum*mul;i++){
			int from = Math.abs(ran.nextInt())%vNum;
			int to = Math.abs(ran.nextInt())%vNum;
			double weight = ran.nextInt(100)-30;
			Edge edge = new Edge(from,to,weight);
		
			boolean isMatch = false;
			for(Edge e:list){
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
		BellmanFord<Double> dij = new BellmanFord<Double>(gragh,source);
		
		for(int i=0;i<vNum;i++){
			if(i==source)
				continue;
			StringBuffer sb = new StringBuffer();
			sb.append("Shortest Path:").append(dij.getShortestWeight(i)).append("\t");
			List<Integer> temp = dij.getShortestPath(i);
			if(temp!=null){
				for(Integer j:temp){
					sb.append(j).append("->");
				}
				System.out.println(sb.substring(0,sb.lastIndexOf("->")));
			}else{
				System.out.println(sb.toString()+"没有！");
			}
		}
		
		
	}

}
