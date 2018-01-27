package com.cn.eric.data.structure;

/*
 * 最大堆：
 * 二叉堆，父节点数值大于任意子节点
 * 注意索引0位置无用，以1为起始
 */

public class MaxHeap{
	private int[] arr;
	private int count;
	private int capacity;
	
	public MaxHeap(int capacity){
		arr = new int[capacity+1];
		count = 0;
		this.capacity = capacity;
	}
	
	/*
	 * heapify过程
	 * 传入数组，最终将数组排序成MaxHeap形式
	 * 
	 * 思想是：
	 * 1.叶子节点因为只有一个节点，所以认为是maxHeap.然后从第一个非叶子节点算起,索引值为n/2(n为数组数量)，然后以此类推进行shiftDown操作直至最后最后一个元素(=1,而不是0)
	 */
	public MaxHeap(int[] arr,int n){
		arr = new int[n+1];
		count = n;
		this.capacity = n+1;
		
		for(int i=0;i<this.arr.length;i++){
			this.arr[i+1]=arr[i];
		}
		
		for(int i=n/2;i>=1;i--){
			shiftDown(i);
		}
	}
	
	public void insert(int t){
		assert this.count+1>this.capacity;
		
		arr[++count] = t;
		shiftUp(count);
		
	}
	
	/*
	 * 返回最大堆的最大值，同时将原来的堆去除掉最大值后重新整理成最大堆
	 */
	public int extractMax(){
		assert count>0;
		
		int ret = arr[1];
		//交换最大值与最后一个叶子节点
		swap(arr,1,count);
		count--;
		
		shiftDown(1);
		return ret;
	}
	
	public void maxHeapSort1(int arr[],int n){
		MaxHeap maxHeap = new MaxHeap(n);
		for(int i=0;i<n;i++)
			maxHeap.insert(arr[i]);
		for(int i=n-1;i>=0;i--)
			arr[i] = maxHeap.extractMax();
	}
	
	/*
	 * 优化部分：减少了n/2的排序过程，heapify的过程是O(n)的
	 */
	public void maxHeapSort2(int arr[],int n){
		MaxHeap maxHeap = new MaxHeap(arr,n);
		for(int i=n-1;i>=0;i--)
			arr[i] = maxHeap.extractMax();
	}
	
	/*
	 * 新插入的元素暂时放在队列尾部，然后通过与父亲节点的比较来逐渐寻找自己的位置
	 */
	private void shiftUp(int k) {
		while(k/2>1&&arr[k/2]<arr[k]){
			swap(arr,k/2,k);
			k/=2;
		}
	}

	/*
	 * 将索引k的位置的元素通过和子节点的比较来最终调整以k为节点的子树的maxHeap结构
	 */
	private void shiftDown(int k) {
		while(k*2<=count){
			int j = 2*k;//左节点
			//是否存在右节点
			if(j + 1 <=count && arr[j]<arr[j+1]){
				j = j+1;
			}
			//如果已经大于子节点，直接break
			if(arr[k]>arr[j]) break;
			swap(arr,k,j);
			k = j;
		}
	}
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
