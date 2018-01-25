package com.cn.eric.data.algorithm;

public class MergeSort {

	/*
	 * 算法思想：将原数组分成logn(n为数组个数)的单独个体，然后排列，之后在合并相连的两个，排列。从而导致各个小个体的内部是排序好的。直至最终完成排序。
	 * 算法缺点是要额外占用空间进行排序。
	 */
	public static void main(String[] args) throws Throwable {
		int[] arr = NumberGenerator.generate(100000, 0, 100);
		int[] arr1 = NumberGenerator.copy(arr);
		int[] arr2 = NumberGenerator.copy(arr);
		int[] arr3 = NumberGenerator.copy(arr);
		int[] arr4 = NumberGenerator.copy(arr);
		NumberGenerator.testSort(MergeSort.class, "mergeSortBU", arr, arr.length);
		NumberGenerator.testSort(MergeSort.class, "mergeSort", arr1, arr1.length);
		NumberGenerator.testSort(MergeSort.class, "mergeSort2", arr2, arr2.length);
		NumberGenerator.testSort(InsertionSort.class, "optimizedInsertionSort", arr4, arr4.length);
	
	}
	
	public static void mergeSort(int[] arr,int n){
		__mergeSort(arr,0,n-1);
	}
	
	public static void mergeSort2(int[] arr,int n){
		__mergeSort2(arr,0,n-1);
	}

	private static void __mergeSort(int[] arr, int l, int r) {
		if(l>=r)
			return;
		int mid = (l+r)/2;
		__mergeSort(arr,l,mid);
		__mergeSort(arr,mid+1,r);
		__merge(arr,l,r);
	}
	
	private static void __mergeSort2(int[] arr, int l, int r) {
		//TODO:优化点；在数据两很小的时候，可以选择使用插入排序，因为数据量小的时候很多小个体都是有序的了。
		if(l>=r)
			return;
		int mid = (l+r)/2;
		__mergeSort(arr,l,mid);
		__mergeSort(arr,mid+1,r);
		//优化点：如果mid已经小于mid+1，则证明[l,r]范围内arr已经有序了。
		if(arr[mid]<arr[mid+1])
			return;
		__merge(arr,l,r);
	}
	
	/*
	 * 自底向上逐渐增加归并个数。从而达到整体的排序
	 */
	public static void mergeSortBU(int[] arr,int n){
		for(int i=1;i<=n;i*=2){
			for(int j=0;j+i<n;j+=2*i){
				//对arr的[j.j+i-1]和[j+i,j+2*i-1]归并排序
				__mergeSort2(arr,j,Math.min(j+2*i-1,n-1));
			}
		}
	}

	//将arr中[l,r]的元素排序，其中分为两部分，一部分是[l,mid]一部分是[mid+1,r]
	private static void __merge(int[] arr, int l, int r) {
		int[] temp = new int[r-l+1];
		for(int k=l;k<=r;k++)
			temp[k-l]=arr[k];
		int i=0;
		int j=temp.length/2+1;
		for(int k=0;k<temp.length;k++){
			if(i>temp.length/2){
				arr[l+k]=temp[j++];
			}
			else if(j>r-l){
				arr[l+k] = temp[i++];
			}else if(temp[i]>temp[j]){
				arr[l+k] = temp[j++];
			}else
				arr[l+k] = temp[i++];
		}
	}

}
