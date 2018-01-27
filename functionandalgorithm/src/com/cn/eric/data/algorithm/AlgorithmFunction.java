package com.cn.eric.data.algorithm;

import java.util.Calendar;
import java.util.Random;

public class AlgorithmFunction {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
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
			if(arr[i]<target){
				swap(arr,i,lt+1);
				i++;
				lt++;
			}
			else if(arr[i]>target){
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
