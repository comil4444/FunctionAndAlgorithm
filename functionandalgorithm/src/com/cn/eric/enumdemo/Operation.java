package com.cn.eric.enumdemo;

public enum Operation {
	PLUS {

		@Override
		double apply(double d1, double d2) {
			return d1+d2;
		}},
	MINUS {

		@Override
		double apply(double d1, double d2) {
			return d1-d2;
		}},
	TIMES {

		@Override
		double apply(double d1, double d2) {
			return d1*d2;
		}},
	DIVIDE {

		@Override
		double apply(double d1, double d2) {
			return d1/d2;
		}};
	
	abstract double apply(double d1,double d2);
	
}
