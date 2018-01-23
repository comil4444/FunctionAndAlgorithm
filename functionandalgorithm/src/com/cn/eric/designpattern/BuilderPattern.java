package com.cn.eric.designpattern;

class Product {
	private String name;
	private String type;
	public void showProduct(){
		System.out.println("名称："+name);
		System.out.println("型号："+type);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
}

abstract class Builder {
	public abstract void setPart(String arg1, String arg2);
	public abstract Product getProduct();
}
class ConcreteBuilder extends Builder {
	private Product product = new Product();
	
	public Product getProduct() {
		return product;
	}

	public void setPart(String arg1, String arg2) {
		product.setName(arg1);
		product.setType(arg2);
	}
}

public class BuilderPattern {
	private Builder builder = new ConcreteBuilder();
	public Product getAProduct(){
		builder.setPart("宝马汽车","X7");
		return builder.getProduct();
	}
	public Product getBProduct(){
		builder.setPart("奥迪汽车","Q5");
		return builder.getProduct();
	}
	
	public static void main(String[] args){
		BuilderPattern director = new BuilderPattern();
		Product product1 = director.getAProduct();
		product1.showProduct();

		Product product2 = director.getBProduct();
		product2.showProduct();
		
	}
}

