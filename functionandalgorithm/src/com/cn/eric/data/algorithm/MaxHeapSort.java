package com.cn.eric.data.algorithm;

public class MaxHeapSort {

	public static void main(String[] args) throws Throwable {
		int[] arr = NumberGenerator.generate(100000, 0, 100);
		int[] arr1 = NumberGenerator.copy(arr);
		NumberGenerator.testSort(MergeSort.class, "mergeSort2", arr, arr.length);
		NumberGenerator.testSort(MaxHeap.class, "maxHeapSort", arr1, arr1.length);
	}

}

class MaxHeap{
	/*
	 * 索引从0开始
	 */

	/*
	 * 思路：
	 * 先将序列排序成maxHeap,然后将第一个元素arr[0](最大值)与最后一个元素换位置。
	 * 然后将排除最后一个元素的序列重新排序成maxHeap,由于其余数据结构是ok的，仅需重新排列第一个元素即可,然后在交换以此类推。
	 */
	public static void maxHeapSort(int[] arr,int n){
		
		//heapify
		for(int i=(n-1)/2;i>=0;i--){
			shiftDown(arr,n,i);
		}
		/*
		 * 父亲节点:(i-1)/2,左节点:2i+1,右节点:2i+2
		 */	
		for(int i=n-1;i>=1;i--){
			swap(arr,0,i);//将最大值排在最后
			shiftDown(arr,i,0);//由于其余数据结构是ok的，仅需重新排列第一个元素即可
		}
	}
	
	private static void shiftDown(int[] arr, int num, int index) {
		while(index*2+1<num){
			int j = 2*index+1;//左节点
			//是否存在右节点
			if(j + 1 <num && arr[j]<arr[j+1]){
				j = j+1;
			}
			//如果已经大于子节点，直接break
			if(arr[index]>=arr[j]) break;
			swap(arr,index,j);
			index = j;
		}
	}

	private static void swap(int[] arr, int a, int b) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
}
