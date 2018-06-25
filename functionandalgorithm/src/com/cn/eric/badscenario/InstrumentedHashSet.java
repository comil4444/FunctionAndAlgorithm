package com.cn.eric.badscenario;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E>{

	/*
	 * 继承的弊病！破坏了类的封装性，应该返回3，却返回了6.可以改用组合来优化该问题
	 * 
	 * 还有在继承的时候确定一下是否是 IS A的关系
	 */
	
	private int counter=0;
	
	public InstrumentedHashSet(){
		super();
	}
	
	@Override
	public boolean add(E e){
		super.add(e);
		counter++;
		return true;
	}
	
	@Override
	public boolean addAll(Collection<? extends E> e){
		super.addAll(e);
		counter+=e.size();
		return true;
	}
	
	public int getCounter(){
		return this.counter;
	}
	
	
	public static void main(String[] args) {
		InstrumentedHashSet<String> set = new InstrumentedHashSet<String>();
		set.addAll(Arrays.asList("a","b","c"));
		System.out.println(set.getCounter());
	}

}
