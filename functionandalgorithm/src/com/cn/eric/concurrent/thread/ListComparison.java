package com.cn.eric.concurrent.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class ListComparison{
	public static void main(String[] args){
		Tester.initMain(1, 100, 10000);
		
		new SynchronizedArrayListTest(10,0);
		new SynchronizedArrayListTest(9,1);
		new SynchronizedArrayListTest(5,5);
		
		new CopyOnWriterArrayListTest(10,0);
		new CopyOnWriterArrayListTest(9,1);
		new CopyOnWriterArrayListTest(5,5);
	}
}

abstract class ListTest extends Tester<List<Integer>>{

	ListTest(String testId, int nReaders, int nWriters) {
		super(testId, nReaders, nWriters);
	}

	class Reader extends TestTask{
		long result = 0l;
		@Override
		void test() {
			for(long i=0;i<testCycles;i++){
				for(int index=0;index<containerSize;index++){
					result += testContainer.get(index);
				}
			}
		}

		@Override
		void putResults() {
			readResult+=result;
			readTime +=duration;
		}
	}
	
	class Writer extends TestTask{

		@Override
		void test() {
			for(long i=0;i<testCycles;i++){
				for(int index=0;index<containerSize;index++){
					testContainer.set(index, writeData[index]);
				}
			}
		}

		@Override
		void putResults() {
			writeTime+=duration;
		}
	}
	
	void startReadrsAndWriters(){
		for(int i=0;i<nReaders;i++)
			es.execute(new Reader());
		for(int i=0;i<nWriters;i++)
			es.execute(new Writer());
	}

}

class SynchronizedArrayListTest extends ListTest{
	SynchronizedArrayListTest(int nReaders, int nWriters) {
		super("syn test arrayList", nReaders, nWriters);
	}

	List<Integer> containerInit(){
		List<Integer> list = new ArrayList<Integer>(containerSize);
		for(int i=0;i<containerSize;i++)
			list.add(i, i);
		return Collections.synchronizedList(list);
	}
}

class CopyOnWriterArrayListTest extends ListTest{
	CopyOnWriterArrayListTest(int nReaders, int nWriters) {
		super("copyOnWrite test arrayList", nReaders, nWriters);
	}

	List<Integer> containerInit(){
		List<Integer> list = new ArrayList<Integer>(containerSize);
		for(int i=0;i<containerSize;i++)
			list.add(i, i);
		return new CopyOnWriteArrayList<Integer>(list);
	}
}
