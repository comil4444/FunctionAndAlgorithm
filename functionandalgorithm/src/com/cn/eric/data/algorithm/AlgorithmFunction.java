package com.cn.eric.data.algorithm;

import java.util.Calendar;
import java.util.Collections;
import java.util.Random;

import com.cn.eric.data.structure.BST;

public class AlgorithmFunction {

	public static void main(String[] args) {
//		testFindKMaxValue();
//		int[] arr = NumberGenerator.generate(20, 0, 100);
//		NumberGenerator.printArray(arr);
//		int[] n = findMthMaxValue(arr,5);
//		NumberGenerator.printArray(n);
//		int[] arr = NumberGenerator.generate(100, 0, 100);
//		InsertionSort.insertionSort(arr, arr.length);
//		NumberGenerator.printArray(arr);
//		int k = binarySearch(arr,1);
//		System.out.println(k);
		BST bst = new BST();
		bst.insert(10, "10");
		bst.insert(5, "5");
		bst.insert(21, "21");
		bst.insert(2, "2");
		bst.insert(6, "6");
		bst.insert(17, "17");
		bst.insert(25, "25");
		bst.insert(1, "1");
		bst.insert(3, "3");
		bst.insert(7, "7");
		bst.insert(12, "12");
		bst.insert(18, "18");
		bst.insert(23, "23");
		bst.insert(40, "40");
		bst.insert(19, "19");
		
		System.out.println(bst);
		
		System.out.println(bst.floor(11));
		System.out.println(bst.floor(4));
		System.out.println(bst.floor(8));
		System.out.println(bst.floor(22));
		System.out.println(bst.floor(0));
		System.out.println(bst.floor(50));
		
		System.out.println("---");
		
		System.out.println(bst.ceil(11));
		System.out.println(bst.ceil(4));
		System.out.println(bst.ceil(8));
		System.out.println(bst.ceil(22));
		System.out.println(bst.ceil(0));
		System.out.println(bst.ceil(50));
		
		
	}

	/*
	 * 尋找k在arr的index，如果不存在返回-1
	 */
	private static int binarySearch(int[] arr,int k){
		return __binarySearch(arr,0,arr.length-1,k);
	}
	
	//從[0,arr.length-1]的區間內尋找k
	private static int __binarySearch(int[] arr, int i, int j, int k) {
		if(i>j)
			return -1;
		int mid = (i+j)>>2;
		if(arr[mid]<k){
			return __binarySearch(arr,mid+1,j,k);
		}else if(arr[mid]>k){
			return __binarySearch(arr,i,mid-1,k);
		}else
			return mid;
	}

	private static void testFindKMaxValue() {
		int[] arr = NumberGenerator.generate(20, 0, 100);
		NumberGenerator.printArray(arr);
		System.out.println(findKthMaxValue(arr,5));
		System.out.println(findKthMaxValue(arr,1));
		System.out.println(findKthMaxValue(arr,2));
		System.out.println(findKthMaxValue(arr,3));
		System.out.println(findKthMaxValue(arr,4));
		System.out.println(findKthMaxValue(arr,6));
	}

	// find the kth max value
	public static int findKthMaxValue(int[] arr, int k) {
		if (k < 1 || k > arr.length)
			throw new IndexOutOfBoundsException();
		/*
		 * 算法思想：使用快排的思想，如果当前p的值大于k,则舍弃前面的序列，处理后面的序列，反之亦然
		 */
		return __findKthMaxValue(arr, k);
	}
	//寻找n个元素中最大的前m个元素集合。用最大堆来实现，形成一个m的堆，然后不断的更新后面的元素。复杂度是nlogm
	public static int[] findMthMaxValue(int[] arr,int m){
		int[] target = new int[m];
		for(int i=0;i<m;i++)
			target[i] = arr[i];
		MaxHeap.maxHeapSort(target, target.length);
		for(int i=m;i<arr.length;i++){
			if(target[0]>arr[i])
				continue;
			target[0] = arr[i];
			MaxHeap.maxHeapSort(target, target.length);
		}
		return target;
	}

	private static int __findKthMaxValue(int[] arr, int k) {
		if (k < 1 || k > arr.length)
			throw new IndexOutOfBoundsException();
		int p = partition(arr);
		if((p+1)<k){
			int[] temp = NumberGenerator.copy(arr, p+1, arr.length-1);
			return __findKthMaxValue(temp,k-p-1);
		}else if((p+1)>k){
			int[] temp = NumberGenerator.copy(arr, 0, p-1);
			return __findKthMaxValue(temp,k-(temp.length-1-p)-1);
		}else{
			return arr[p];
		}
	}

	private static int partition(int[] arr) {
		if(arr.length<=1)
			return 0;
		int target = arr[0];
		int lt = 0;	//[l,lt]<v
		int gt = arr.length-1;	//[gt,r]>v
		int i=1;	//else
		while(i<=gt){
			if(arr[i]>target){
				swap(arr,i,lt+1);
				i++;
				lt++;
			}
			else if(arr[i]<target){
				swap(arr,i,gt);
				gt--;
			}
			else{
				i++;
			}
		}
		swap(arr,0,lt);
		return lt;
	}

	private static void swap(int[] arr, int i, int minIndex) {
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
	}

}
