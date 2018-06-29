package com.cn.eric.badscenario;  

import java.util.Comparator;

/*
 * 應該返回0，卻返回了1
 * 問題在於自動拆箱裝箱時候，><使用的是基本類型，==時候就比較的是同一性(對象的比較)
 */
public class AutoBoxingDemo {

	static Comparator<Integer> naturalComparator = new Comparator<Integer>(){
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1<o2?-1:o1==o2?0:1;
		}
	};
	
	public static void main(String[] args) {
		System.out.println(naturalComparator.compare(new Integer(42), new Integer(42)));
	}

}
  
