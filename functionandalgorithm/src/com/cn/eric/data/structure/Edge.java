package com.cn.eric.data.structure;

public class Edge<Weight extends Number> implements Comparable<Edge>{
	private int from;
	private int to;
	Weight wt;
	
	public Edge(int from,int to,Weight wt){
		this.from = from;
		this.to = to;
		this.wt = wt;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public Weight getWt() {
		return wt;
	}

	public void setWt(Weight wt) {
		this.wt = wt;
	}
	
	public int other(int a){
		assert a==this.from||a==this.to;
		return a==this.from?this.to:this.from;
	}
	
	@Override
	public int hashCode(){
		return (int) (Math.pow(this.from,2)+Math.pow(this.to, 2));
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Edge){
			return ((Edge)o).getFrom()==this.getFrom()&&((Edge)o).getTo()==this.getTo()&&((Edge)o).getWt()==this.getWt()?true:false;
		}
		return false;
	}

	/*
	 * 端点是否在连接线上
	 * @param node
	 * @return
	 */
	public boolean isInEdge(int node){
		return node == from || node == to? true:false;
	}
	
	
	@Override
	public int compareTo(Edge o) {
		return (int)(this.getWt().doubleValue()-o.getWt().doubleValue());
	}
}
