package com.cn.eric.designpattern;

public class NutritionFacts {
	private final int count;
	private final int calories;
	private final int fat;
	private final int sodium;
	
	public static void main(String[] args){
		NutritionFacts facts = new NutritionFacts.Builder(1).setCal(10).setFat(0).setSod(10).build();
	}

	public static class Builder {
		private int count;

		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;

		Builder(int count) {
			this.count = count;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

		public Builder setCal(int cal) {
			this.calories = cal;
			return this;
		}

		public Builder setFat(int fat) {
			this.fat = fat;
			return this;
		}

		public Builder setSod(int sod) {
			this.sodium = sod;
			return this;
		}
	}

	private NutritionFacts(Builder build) {
		this.calories = build.calories;
		this.count = build.count;
		this.fat = build.fat;
		this.sodium = build.sodium;
	}

	public String toString(){
		return new StringBuffer().append(this.count).append(":").append(this.calories).append(this.fat).append(this.sodium).toString();
	}
}
