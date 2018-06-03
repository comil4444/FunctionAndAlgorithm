package com.cn.eric.basic.syntax.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/*
 * 过滤File底下的文件名
 */
public class DirList {
	
	public static void main(final String[] args){
		File path = new File(".");
		String[] list = null;
		if(args.length==0)
			list = path.list();
		else{
			list = path.list(new FilenameFilter(){

				private Pattern pattern = Pattern.compile(args[0]);
				@Override
				public boolean accept(File dir, String name) {
					return pattern.matcher(name).matches();
				}
				
			});
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String item:list){
			System.out.println(item);
		}
	}
}
