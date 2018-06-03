package com.cn.eric.designpattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class DynamicProxy extends Client implements InvocationHandler {
	
	Object tar;

	public static void main(String[] args) {
		iClient client = new Client();
		DynamicProxy dp = new DynamicProxy(client);
		dp.sayHello();
		dp.sayHi("eric");
	}
	
	public DynamicProxy(Object obj){
		this.tar = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		List<String> list = new ArrayList<String>();
		list.add("1");
		method.invoke(Proxy.newProxyInstance(tar.getClass().getClassLoader(), this.getClass().getInterfaces(),this), args);
		System.out.println(list.size());
		return proxy;
	}

}

interface iClient{
	void sayHi(String name);
	void sayHello();
}

class Client implements iClient{
	public void sayHi(String name){
		System.out.println("Hi,"+name);
	}
	public void sayHello(){
		System.out.println("Hello");
	}
}
