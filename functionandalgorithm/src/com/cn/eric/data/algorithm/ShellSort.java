package com.cn.eric.data.algorithm;

public class ShellSort {

	/*
	 * 算法思想：基于插入排序的优化。把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，
	 * 每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止。
	 * 增量选取：n/2
	 */
	public static void main(String[] args) throws Throwable {
		int[] arr = NumberGenerator.generate(100000, 0, 20);
		int[] arr1 = NumberGenerator.copy(arr);
		NumberGenerator.testSort(ShellSort.class, "shellSort", arr,
				arr.length);
		NumberGenerator.testSort(ShellSort.class, "shellSort2", arr1,
				arr1.length);
	}
	
	public static void shellSort(int[] arr,int n){
		for(int gap = n/2;gap>0;gap/=2){
			//从第gap个元素
			for(int i=gap;i<n;i++){
				int j = i;
				while(j-gap>=0&&arr[j-gap]>arr[j]){
					swap(arr,j,j-gap);
					j-=gap;
				}
					
			}
		}
	}
	
	public static void shellSort2(int[] arr,int n){
		for(int gap = n/2;gap>0;gap/=2){
			//从第gap个元素
			for(int i=gap;i<n;i++){
				int j = i;
				int temp = arr[i];
				while(j-gap>=0&&arr[j-gap]>temp){
					arr[j]=arr[j-gap];
					j-=gap;
				}
				arr[j]=temp;
			}
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}

}
