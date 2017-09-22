package com.cn.eric.basic.syntax;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import static java.lang.System.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		Collections.addAll(set, "one two three four five six seven eight".split(" "));
		print(set);
		String low = set.first();
		String high = set.last();
		out.println(set.first());
		out.println(set.last());
		
		Iterator it = set.iterator();
		for(int i=0;i<=6;i++){
			if(i==3) low=it.next().toString();
			if(i==6) high=it.next().toString();
			else it.next();
		}
		
		out.println(low);
		out.println(high);
		
		print(set.subSet(low, high));
		print(set.headSet(high));
		print(set.tailSet(low));
	}
	
	private static void print(Collection c){
		Iterator it = c.iterator();
		while(it.hasNext()){
			out.print(it.next().toString());out.print(",");
		}
	}
}
