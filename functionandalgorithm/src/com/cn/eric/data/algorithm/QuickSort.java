package com.cn.eric.data.algorithm;

import java.util.Calendar;
import java.util.Random;

public class QuickSort {

	/*
	 * 算法思想：取整体第一个元素作为标志，大于放右边，小于放左边，然后再根据各个小分段不断递归。从而得到最终的结果 算法优化：
	 * 1.选取随机数而非第一个数，从而可以避免序列近乎有序时候递归树严重不平衡的问题--quickSort2 
	 * 2.在数据量低的时候可以使用插入排序
	 * 3.在有大量重复数据的时候，为防止重复数据在一边导致递归树不平衡的问题，采用双面排查的方法。从而可以保证递归树的平衡性。--quickSort3
	 * 4.同时对于有大量元素的重复情况，可以使用quickSort3Ways来处理，该方法是将序列按照标志位分成三部分，<,=,>从而加快排序过程
	 * 
	 */
	public static void main(String[] args) throws Throwable {
//		int[] arr = NumberGenerator.generate(50000, 0, 50);
//		int[] arr1 = NumberGenerator.copy(arr);
//		int[] arr2 = NumberGenerator.copy(arr);
//		NumberGenerator.testSort(InsertionSort.class, "insertionSort", arr1,
//				arr1.length);
//		NumberGenerator.testSort(QuickSort.class, "quickSort", arr2,
//				arr2.length);

//		int[] arr3 = NumberGenerator.generateNearlySorted(100000, 50);
//		int[] arr4 = NumberGenerator.copy(arr3);
//		NumberGenerator.testSort(QuickSort.class, "quickSort", arr3,
//				arr3.length);
//		NumberGenerator.testSort(QuickSort.class, "quickSort2", arr4,
//				arr4.length);
		
		int[] arr5 =  NumberGenerator.generate(50000, 0, 10);
		int[] arr6 = NumberGenerator.copy(arr5);
		int[] arr7 = NumberGenerator.copy(arr5);
		int[] arr8 = NumberGenerator.copy(arr5);
		NumberGenerator.testSort(QuickSort.class, "quickSort", arr5,
				arr5.length);
		NumberGenerator.testSort(QuickSort.class, "quickSort2", arr6,
				arr6.length);
		NumberGenerator.testSort(QuickSort.class, "quickSort3", arr7,
				arr7.length);
		NumberGenerator.testSort(QuickSort.class, "quickSort3Ways", arr8,
				arr8.length);
	}

	public static void quickSort(int[] arr, int n) {
		__quickSort(arr, 0, n - 1);
	}

	public static void quickSort2(int[] arr, int n) {
		__quickSort2(arr, 0, n - 1);
	}

	public static void quickSort3(int[] arr, int n) {
		__quickSort3(arr, 0, n - 1);
	}
	
	public static void quickSort3Ways(int[] arr,int n){
		__quickSort3Ways(arr,0,n-1);
	}

	/*
	 * 将序列arr的部分分成三部分[l,r]
	 * [l,lt]<v,[lt+1,gt-1]==v,[gt,r]>v
	 * 之后递归[l,lt]以及[gt,r]即可
	 */
	private static void __quickSort3Ways(int[] arr, int l, int r) {
		if(l>=r)
			return;
		//partition
		// 随机选取一个位置，然后和最左边的元素交换，这样就不用修改原来代码了
		Random random = new Random(Calendar.getInstance().getTimeInMillis());
		int p = Math.abs(random.nextInt() % (r - l + 1) + l);
		swap(arr, p, l);
		int target = arr[l];
		int lt = l;	//[l,lt]<v
		int gt = r;	//[gt,r]>v
		int i=l+1;	//else
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
		swap(arr,l,lt);
		__quickSort3Ways(arr,l,lt-1);
		__quickSort3Ways(arr,gt,r);
	}

	private static void __quickSort3(int[] arr, int l, int r) {
		if (l >= r)
			return;
		int p = partition3(arr, l, r);
		__quickSort(arr, l, p - 1);
		__quickSort(arr, p + 1, r);
	}

	private static int partition3(int[] arr, int l, int r) {
		// 随机选取一个位置，然后和最左边的元素交换，这样就不用修改原来代码了
		Random random = new Random(Calendar.getInstance().getTimeInMillis());
		int p = Math.abs(random.nextInt() % (r - l + 1) + l);
		swap(arr, p, l);
		int target = arr[l];
		int i=l+1,j=r;
		//arr[l+1...i)<=v,arr[j...r]>=v
		while(true){
			while(i<=r&&arr[i]<=target) i++;
			while(j>=l+1&&arr[j]>=target) j--;
			if(i>j)
				break;
			swap(arr,i,j);
		}
		swap(arr,l,j);
		return j;
	}

	// 对于arr中[l,r]的元素进行以第一个元素为标准的排序(小于放左边，大于放右边)
	private static void __quickSort(int[] arr, int l, int r) {
		if (l >= r)
			return;
		int p = partition(arr, l, r);
		__quickSort(arr, l, p - 1);
		__quickSort(arr, p + 1, r);

	}

	private static void __quickSort2(int[] arr, int l, int r) {
		if (l >= r)
			return;
		int p = partition2(arr, l, r);
		__quickSort(arr, l, p - 1);
		__quickSort(arr, p + 1, r);

	}

	// 返回元素p使得arr[l,p-1]<arr[p]且arr[p+1]>arr[p]
	private static int partition(int[] arr, int l, int r) {
		int j = l;
		int target = arr[l];
		for (int i = l + 1; i <= r; i++) {
			if (arr[i] < target) {
				swap(arr, ++j, i);
			}
		}
		swap(arr, l, j);
		return j;
	}

	// 返回元素p使得arr[l,p-1]<arr[p]且arr[p+1]>arr[p]
	// 优化点：随机选取标志数，这样可以修复在基本有序数组中，快速排序蜕变成o(n2)
	private static int partition2(int[] arr, int l, int r) {
		// 随机选取一个位置，然后和最左边的元素交换，这样就不用修改原来代码了
		Random random = new Random(Calendar.getInstance().getTimeInMillis());
		int p = Math.abs(random.nextInt() % (r - l + 1) + l);
		swap(arr, p, l);
		int j = l;
		int target = arr[l];
		for (int i = l + 1; i <= r; i++) {
			if (arr[i] < target) {
				swap(arr, ++j, i);
			}
		}
		swap(arr, l, j);
		return j;
	}

	public static void swap(int[] arr, int a, int b) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
}
