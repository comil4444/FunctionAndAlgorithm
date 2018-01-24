package com.cn.eric.data.algorithm;

public class SelectionSort {

	/*
	 * 算法思想：找到剩余最小的，和剩余的第一个交换，一次类推。即找到[i,n]最小的，然后与i位置交换
	 */
	public static void main(String[] args) throws Throwable {
//		testSelectionSortWithArrInt();
//		testSelectTionsSortWithT();
//		testSelectTionsSortWithFloat();
//		testSelectTionsSortWithString();
		int[] arr = NumberGenerator.generate(10000, 0, 50);
		NumberGenerator.testSort(SelectionSort.class, "selectionSorted", arr, arr.length);
	}

	private static void testSelectTionsSortWithString() {
		String[] strings = {"1","5","-1","2","a"};
		int n = strings.length;
		selectionSorted(strings,n);
		for(int i=0;i<n;i++)
			System.out.print(strings[i]+",");
	}

	private static void testSelectTionsSortWithFloat() {
		Float[] f = {1.1f,3.0f,-1.1f,5.8f,-0.1f,0.0f};
		int n = f.length;
		selectionSorted(f,n);
		for(int i=0;i<n;i++)
			System.out.print(f[i]+",");
		
	}

	private static void testSelectTionsSortWithT() {
		class SortObject implements Comparable{
			int i;
			public SortObject(int i){
				this.i = i;
			}
			@Override
			public int compareTo(Object o) {
				return this.i-((SortObject)o).i;
			}
		}
		
		SortObject[] so = {new SortObject(10),new SortObject(1),new SortObject(5),new SortObject(3),new SortObject(9)};
		int n = so.length;
		selectionSorted(so,n);
		for(int i=0;i<n;i++)
			System.out.print(so[i].i+",");
		
	}

	private static void testSelectionSortWithArrInt() {
		int[] arr = {1,3,10,5,2,8,4};
		int n=arr.length;
		
		selectionSorted(arr, n);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+",");
	}

	public static void selectionSorted(int[] arr, int n) {
		for(int i=0;i<n;i++){
			//寻找区间[i,n)最小值
			int minIndex = i;
			for(int j=i;j<n;j++){
				if(arr[minIndex]>arr[j])
					minIndex = j;
			}
			swap(arr,i,minIndex);
		}
	}

	private static void swap(int[] arr, int i, int minIndex) {
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex]=temp;		
		}

	public static <T extends Comparable> void selectionSorted(T arr[], int n) {
		for(int i=0;i<n;i++){
			//寻找区间[i,n)最小值
			int minIndex = i;
			for(int j=i;j<n;j++){
				if(arr[minIndex].compareTo(arr[j])>0)
					minIndex = j;
			}
			swap(arr,i,minIndex);
		}
		
	}

	private static <T> void swap(T arr[], int i, int minIndex) {
		T temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex]=temp;
	}

}
