package com.cn.eric.badscenario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 * 問題在於List有remove(int)的方法，也有remove(Object)的方法,錯誤的重載和自動裝箱可能導致不一樣的結果
 */
public class OverloadedDemo {


	public static void main(String[] args) {

		
		
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=-3;i<3;i++){
			list.add(i);
			set.add(i);
		}
		
		for(int i=0;i<3;i++){
			list.remove(i);
			set.remove(i);
		}
		
		for(Integer i:list)
			System.out.println(i);
		

		for(Integer i:set)
			System.out.println(i);
	}

}
