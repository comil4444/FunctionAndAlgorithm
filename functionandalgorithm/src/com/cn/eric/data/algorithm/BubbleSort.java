package com.cn.eric.data.algorithm;

public class BubbleSort {

	/*
	 * 算法思想： 从后往前，相邻两个元素作比较，如果后一个小于前一个，则交换两个的位置，一次循环会将剩餘元素中最小的放到最前面的位置。
	 */
	public static void main(String[] args) throws Throwable {
		int[] arr = NumberGenerator.generate(10000, 0, 500);
		NumberGenerator.testSort(SelectionSort.class, "selectionSorted", arr,
				arr.length);
		NumberGenerator.testSort(BubbleSort.class, "bubbleSort", arr,
				arr.length);

	}

	public static void bubbleSort(int[] a, int n) {
		int temp = 0;
		for (int i = n - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (a[j + 1] < a[j]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {
		arr[a] = arr[a] + arr[b];
		arr[b] = arr[a] - arr[b];
		arr[a] = arr[a] - arr[b];
	}
}
