package com.cn.eric.data.algorithm;

public class InsertionSort {
	
	/*
	 * 算法思想：假定第一个数已经排序，按顺序考虑后面的数字，[i,n],以此插入到前面已经排序好的序列中。
	 * 该算法中如果对于序列已经基本排序好了，那么排序效率很高
	 */
	public static void main(String[] args) throws Throwable{
		int[] arr = NumberGenerator.generate(50000, 0, 50);
		int[] arr1 = NumberGenerator.copy(arr);
		int[] arr2 = NumberGenerator.copy(arr);
		NumberGenerator.testSort(SelectionSort.class, "selectionSorted", arr, arr.length);
		NumberGenerator.testSort(InsertionSort.class, "insertionSort", arr1, arr1.length);
		NumberGenerator.testSort(InsertionSort.class, "optimizedInsertionSort", arr2, arr2.length);
		
		int[] arr3 = NumberGenerator.generateNearlySorted(50000, 10);
		int[] arr4 = NumberGenerator.copy(arr3);
		NumberGenerator.testSort(InsertionSort.class, "optimizedInsertionSort", arr3, arr3.length);
		NumberGenerator.testSort(SelectionSort.class, "selectionSorted", arr4, arr4.length);
	}
	
	public static void insertionSort(int[] arr,int n){
		//第一个已经排序
		for(int i=1;i<n;i++){
			//前面已经排序好，从后往前一个一个比
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1])
					swap(arr,j,j-1);
				else
					break;
			}
		}
	}
	
	public static void optimizedInsertionSort(int[] arr,int n){
		//第一个已经排序
		for(int i=1;i<n;i++){
			//前面已经排序好，复制副本，与前一个比较，如果大，则将前一个元素复制到当前元素位置。继续比较
			//这样做的好处是减少了元素的交换
			int temp = arr[i];//当前元素
			int j;//当前元素最终位置
			for(j=i;j>0&&arr[j]-1>temp;j--){
				if(arr[j-1]>temp)
					arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
	}
	
	private static void swap(int[] arr, int i, int minIndex) {
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex]=temp;		
	}
}
