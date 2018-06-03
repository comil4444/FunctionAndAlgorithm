package com.cn.eric.basic.syntax.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;


public class ChannelDemo {


	public static void main(final String[] args) throws Throwable{
//		writeFile();
//		copyFile();
		getCharset();
	}

	private static void getCharset() {
		SortedMap<String, Charset> map = Charset.availableCharsets();
		for(Map.Entry<String, Charset> entry:map.entrySet()){
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

	private static void copyFile() throws FileNotFoundException, IOException {
		FileChannel in = new FileInputStream(new File("a.txt")).getChannel();
		FileChannel out = new FileOutputStream(new File("b.txt")).getChannel();
		out.transferFrom(in, 0, in.size());
	}

	private static void writeFile() throws FileNotFoundException, IOException {
		FileChannel fc = new FileOutputStream(new File("a.txt")).getChannel();
		fc.write(ByteBuffer.wrap("testByteBuffer".getBytes()));
		fc.close();
	}
}
