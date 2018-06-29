package com.cn.eric.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Stack<E> {
	private Object[] elements;
	private int size=0;
	private static final int DEFAULT_SIZE=16;
	
	public Stack(){
		elements = new Object[DEFAULT_SIZE];
	}
	public void push(E o){
		ensureSize();
		elements[size++]=o;
	}

	private void ensureSize() {
		if(size==elements.length)
			elements = Arrays.copyOf(elements, 2*size+1);
	}
	
	public E pop(){
		if(size==0)
			return null;
		return (E)elements[--size];
	}
	
	public void pushAll(Iterable<? extends E> src){
		for(E e:src){
			push(e);
		}
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	
	public void popAll(Collection<? super E> dst){
		while(isEmpty()){
			dst.add(pop());
		}
	}
	
	public static void main(String[] args){
		Stack<Number> stack = new Stack<Number>();
		Iterable<Integer> it = Arrays.asList(1,2,3);
		stack.pushAll(it);
		Collection<Object> os = new ArrayList<Object>();
		stack.popAll(os);
	}
}
