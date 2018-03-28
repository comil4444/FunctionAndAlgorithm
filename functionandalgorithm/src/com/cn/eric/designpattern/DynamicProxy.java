package com.cn.eric.designpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DynamicProxy extends Client implements InvocationHandler {

	public static void main(String[] args) {
		DynamicProxy dp = new DynamicProxy();
		dp.sayHello();
		dp.sayHi("eric");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		List<String> list = new ArrayList<String>();
		list.add("1");
		method.invoke(new Client(), args);
		System.out.println(list.size());
		return proxy;
	}

}

class Client{
	static void sayHi(String name){
		System.out.println("Hi,"+name);
	}
	static void sayHello(){
		System.out.println("Hello");
	}
}
