package com.cn.eric.basic.syntax.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws Throwable{
		File file = writeFile();
		copyFile(new File("a.txt"),new File("b.txt"));
	}

	private static void copyFile(File file,File target) throws Throwable {
		int threadNum = 5;
		long length = file.length();
		long segment = length/threadNum;
		for(int i=0;i<threadNum;i++){
			Thread t = new Thread(new Worker(file,target,i*segment,(i+1)*segment));
			t.start();
		}
	}

	private static File writeFile() throws IOException {
		File file = new File("a.txt");
		FileWriter fw = new FileWriter(file);
		
		BufferedWriter bw = new BufferedWriter(fw);

		for(int i=0;i<1000;i++){
			String temp = new StringBuffer().append(new Random().nextLong()).append("\t").append(new Random().nextBoolean()).append("\r\n").toString();
			bw.write(temp.toCharArray());
			bw.flush();
		}
		bw.close();
		return file;
	}
	
	static class Worker implements Runnable{
		private File file;
		private File target;
		private long start;
		private long end;
		
		public Worker(File file,File target,long start,long end){
			this.file = file;
			this.target =target;
			this.start = start;
			this.end = end;
		}
		
		@Override
		public void run() {
			byte[] buffer = new byte[1024];
			try{
				RandomAccessFile reader=new RandomAccessFile(file,"r");//为每个线程定义一个读取的对象  
				RandomAccessFile writer= new RandomAccessFile(target,"rw"); 
				
				reader.seek(start);
				writer.seek(start);
				while(start<end)  
	             {  
	                 int len=0;  
	                 if(start+buffer.length<end)//如果可以装满一个缓冲区  
	                 {  
	                     len=reader.read(buffer);
	                      
	                 }else  
	                 {  
	                     len=reader.read(buffer,0,(int)(end-start));  
	                 }  
	                 writer.write(buffer,0,len);  
	                 start+=len;  
	             } 
			}catch(Exception e){
				
			}
		}
		
	}
	
}
