package com.cn.eric.data.structure;

import java.util.Collection;

public class MinHeap{

	/*
	 * 最小堆：
	 * 1.完全二叉树
	 * 2.本身比任意子节点都小
	 */
	
	//arr从1开始，0舍弃，从而方便了子节点的运算
	private int[] arr;
	//当前树中的节点个数
	private int count;
	//树中最大节点个数
	private int capacity;
	
	public MinHeap(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
	}
	
	/*
	 * 思路：
	 * 1.完全二叉树，所以n/2个节点是叶子节点(同时也是最大堆)
	 * 2.由于最大堆二叉树的任意一个子树也是最大堆，所以该性质反推，重新让各个子树是最大堆，则可以重新保证整棵树是最大堆的性质
	 * 3.遍历剩下的节点，做shiftDown操作即可
	 */
	public MinHeap(int[] arr){
		this.arr = new int[arr.length+1];
		capacity = arr.length;
		this.count = arr.length;
		for(int i=0;i<arr.length;i++)
			this.arr[i+1]=arr[i];
		for(int i=count/2;i>=1;i--)
			shiftDown(i);
	}
	
	public void insert(int i){
		count++;
		arr[count] = i;
		shiftUp(count);
	}
	
	public void insertCol(Collection<Integer> col){
		for(Integer i:col){
			insert(i);
		}
	}
	
	/*
	 * 思路：与父亲节点相比，如果满足条件则交换位置继续
	 */
	private void shiftUp(int pos) {
		while(pos>1&&arr[pos/2]>arr[pos]){
			swap(arr,pos/2,pos);
			pos = pos/2;
		}
	}
	
	/*
	 * 思路：
	 * 1.拿掉树顶arr[1]的值，然后用最后一个值替代。
	 * 2.对树顶的值做shiftDown操作，如果该值小于子树的最小值，则交换继续
	 */
	public Integer extractMin(){
		if(count==0)
			return null;
		if(count==1){
			count--;
			return arr[1];
		}
		int target = arr[1];
		
		arr[1] = arr[count];
		count--;
		
		shiftDown(1);
		
		return target;
	}
	
	
	private void shiftDown(int pos) {
		if(2*pos<=count){
			//左节点
			int j = 2*pos;
			//是否存在右节点且小于左节点
			if((j+1)<=count&&arr[j+1]<arr[j])
				j=j+1;
			if(arr[pos]>arr[j]){
				swap(arr,pos,j);
				shiftDown(j);
			}
		}
	}

	public int getCount() {
		return count;
	}
	
	public boolean isEmpty(){
		return count==0;
	}
	
	public void swap(int[] arr, int a, int b) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
	
	
	
	
}
