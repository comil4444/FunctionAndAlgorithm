package com.cn.eric.data.algorithm;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class NumberGenerator{
	public static int[] generate(int n,int scopeLow, int scopeHigh){
		Random random = new Random(new Date().getTime());
		int[] target = new int[n];
		for(int i=0;i<n;i++){
			target[i] = random.nextInt()%(scopeHigh-scopeLow+1)+scopeLow;
		}
		return target;
	}
	
	public static int[] generateNearlySorted(int n,int swapTimes){
		Random random = new Random(new Date().getTime());
		int[] target = new int[n];
		for(int i=0;i<n;i++){
			target[i] = i;
		}
		for(int i=1;i<=swapTimes;i++){
			int posX = Math.abs(random.nextInt()%n);
			int posY = Math.abs(random.nextInt()%n);
			swap(target,posX,posY);
		}
		return target;
	}
	
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	
	public static void testSort(Class<?> clazz,String method,int[] arr,int n) throws Throwable, Throwable{
		Method m = clazz.getDeclaredMethod(method, new Class[]{arr.getClass(),int.class});
		long startTime = Calendar.getInstance().getTimeInMillis();
		m.invoke(clazz, arr,n);
		long endTime = Calendar.getInstance().getTimeInMillis();
		assert isSorted(arr);
		System.out.println(method+"运行了:"+(double)(endTime-startTime)/1000+"s");
	}
	
	public static boolean isSorted(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}
	
	public static int[] copy(int arr[]){
		int target[] = new int[arr.length];
		target = Arrays.copyOf(arr, arr.length);
		return target;
	}
	
	public static int[] copy(int arr[],int start,int end){
		int target[] = new int[end-start+1];
		for(int i=0;i<target.length;i++){
			target[i]=arr[i+start];
		}
		return target;
	}
	
	private static void swap(int[] arr, int i, int minIndex) {
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex]=temp;		
	}
}
