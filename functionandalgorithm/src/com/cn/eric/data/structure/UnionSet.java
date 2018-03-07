package com.cn.eric.data.structure;

public class UnionSet {
	
	int[] parent;
	int[] rank;
	
	public int find(int p) {
		while(p!=parent[p])
			p=parent[p];
		return p;
	}
	
	
	
}
