package com.cn.eric.enumdemo;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetDemo {

	public static final int STYLE_1 = 1<<0;
	public static final int STYLE_2 = 1<<1;
	public static final int STYLE_3 = 1<<2;
	public static final int STYLE_4 = 1<<3;
	
	public enum Style{
		STYLE_1,STYLE_2,STYLE_3,STYLE_4;
	}
	
	public static void applyStyles(int styles){
		
	}
	
	public static void applyStylesWithEnumSet(Set<Style> styles){
		
	}
	
	public static void main(String[] args) {
		applyStyles(STYLE_1+STYLE_2);
		applyStylesWithEnumSet(EnumSet.of(Style.STYLE_1, Style.STYLE_2));
	}
	

}
