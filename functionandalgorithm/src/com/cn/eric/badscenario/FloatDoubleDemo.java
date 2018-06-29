package com.cn.eric.badscenario;  
public class FloatDoubleDemo {

	public static void main(String[] args) {
		System.out.println("-----------float demo----------");
		System.out.println(1.03f-0.04f);
		System.out.println("-----------double demo----------");
		double d = 1.00;
		for(double dt = 0.1;d>0;dt=dt+0.1){
			System.out.println(d=(d-dt));
		}
		
	}

}
  
