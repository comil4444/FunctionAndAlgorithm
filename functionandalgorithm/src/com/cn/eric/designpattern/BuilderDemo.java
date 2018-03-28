package com.cn.eric.designpattern;

import java.util.ArrayList;
import java.util.List;

/*
	意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
	
	主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
	
	何时使用：一些基本部件不会变，而其组合经常变化的时候。
	
	如何解决：将变与不变分离开。
	
	关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
	
	应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 2、JAVA 中的 StringBuilder。
	
	优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
	
	缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
	
	使用场景： 1、需要生成的对象具有复杂的内部结构。 2、需要生成的对象内部属性本身相互依赖。
	
	注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
	
*/	
public class BuilderDemo {

	public static void main(String[] args) {
		Meal a = MealBuilder.getChoiceA();
		a.showItems();
		System.out.println(a.getPrice());
		
		Meal b = MealBuilder.getChoiceB();
		b.showItems();
		System.out.println(b.getPrice());
		
	}
	
	static class MealBuilder{
		static Meal getChoiceA(){
			Meal meal = new Meal();
			meal.add(new ChickBurger());
			meal.add(new Coke());
			return meal;
		}
		
		static Meal getChoiceB(){
			Meal meal = new Meal();
			meal.add(new VegBurger());
			meal.add(new Pepsi());
			return meal;
		}
	}
	
	static class Meal{
		List<Item> meal = new ArrayList<Item>();
		
		void add(Item item){
			meal.add(item);
		}
		
		float getPrice(){
			if(meal==null)
				return 0f;
			float price = 0f;
			for(Item item:meal){
				price+=item.price();
			}
			return price;
		}
		
		void showItems(){
			if(meal==null)
				return;
			for(Item item:meal){
				System.out.println(item.name());
			}
		}
	}

	interface Item {
		String name();

		Package packing();

		float price();
	}

	interface Package {
		String pack();
	}

	static class Wrapper implements Package {

		@Override
		public String pack() {
			System.out.println("wrapping");
			return "wrapper";
		}

	}

	static class Bottle implements Package {

		@Override
		public String pack() {
			System.out.println("Bottling");
			return "Bottle";
		}
	}
	
	static abstract class Burger implements Item{
		public Package packing(){
			return new Wrapper();
		}
	}
	
	static abstract class Drink implements Item{
		public Package packing(){
			return new Bottle();
		}
	}
	
	static class VegBurger extends Burger{

		@Override
		public String name() {
			return this.getClass().getSimpleName();
		}

		@Override
		public float price() {
			return 10f;
		}
	}
	
	static class ChickBurger extends Burger{

		@Override
		public String name() {
			return this.getClass().getSimpleName();
		}

		@Override
		public float price() {
			return 20f;
		}
	}
	
	static class Pepsi extends Drink{

		@Override
		public String name() {
			return this.getClass().getSimpleName();
		}

		@Override
		public float price() {
			return 1f;
		}
	}
	
	static class Coke extends Drink{

		@Override
		public String name() {
			return this.getClass().getSimpleName();
		}

		@Override
		public float price() {
			return 2f;
		}
	}

	

}
