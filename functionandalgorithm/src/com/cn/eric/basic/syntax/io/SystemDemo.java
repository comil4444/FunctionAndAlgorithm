package com.cn.eric.basic.syntax.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SystemDemo {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp;
		String output = "";
		while((temp = br.readLine())!=null&&temp.length()!=0){
			output +=temp.toUpperCase();
		}
		PrintStream ps = new PrintStream(System.out,true);
		
		ps.println(output);
		ps.close();
		br.close();
	}

}
