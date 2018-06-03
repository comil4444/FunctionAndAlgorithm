package com.cn.eric.basic.syntax.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessDemo {

	public static void main(String[] args) throws Throwable {
		Process process = new ProcessBuilder("javap ProcessDemo").start();
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		
		String str="";
		while((str = reader.readLine())!=null){
			System.out.println(str);
		}
		
	}

}
