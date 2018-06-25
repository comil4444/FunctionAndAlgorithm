package com.cn.eric.badscenario;

import java.util.Arrays;

/*
 * 存在內存泄漏
 */
public class Stack {
	private Object[] elements;
	private int size=0;
	private static final int DEFAULT_SIZE=16;
	
	public Stack(){
		elements = new Object[DEFAULT_SIZE];
	}
	
	public void push(Object o){
		ensureSize();
		elements[size++]=o;
	}

	private void ensureSize() {
		if(size==elements.length)
			elements = Arrays.copyOf(elements, 2*size+1);
	}
	
	public Object pop(){
		if(size==0)
			return null;
		return elements[--size];
	}
}
