package com.cn.eric.data.structure;

public class UnionSet {
	
	/*
	 * 用于解决多个点是否相连问题，例子可参考：http://blog.csdn.net/The_best_man/article/details/62418823
	 */
	int[] parent;
	int[] rank;
	int count;
	
	public UnionSet(int count){
		parent = new int[count];
		rank = new int[count];
		for(int i=0;i<count;i++){
			parent[i] = i;
			rank[i] = 1;
		}
		this.count = count;
	}
	
	public int find(int p) {
		while(p!=parent[p])
			p=parent[p];
		return p;
	}
	
	/*
	 * 路径压缩可以有效的将树形数据降低层级：
	 *        5								5
	 *       /                             /
	 *      4                             4
	 *     /		-->                  / \
	 *    3                             3   2
	 *   /
	 *  2
	 */     
	 
	 
	public int findCompressPath(int p){
		while(p!=parent[p]){
			p = parent[parent[p]];
			p = parent[p];
		}
		return p;
	}
	
	/*
	 * 极端压缩可以有效的将树形数据降低层级：
	 *        5								5
	 *       /                             /\ \
	 *      4                             4  3 2
	 *     /		-->                  
	 *    3                             
	 *   /
	 *  2
	 */ 
	public int findRecursion(int p){
		if(parent[p]!=p)
			parent[p] = findRecursion(p);
		return p;
	}
	
	public void union(int p,int q){
		int pRoot = find(p);
		int qRoot = find(q);
		if(rank[pRoot]>rank[qRoot])
			parent[qRoot] = pRoot;
		else if(rank[pRoot]<rank[qRoot])
			parent[pRoot] = qRoot;
		else{
			parent[qRoot] = pRoot;
			rank[qRoot]++;
		}
		return;
	}
	
	public boolean isConnected(int p,int q){
		return find(p)==find(q);
	}
	
}
