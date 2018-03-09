package com.cn.eric.data.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class SparseGragh implements Gragh {

	private Map<Integer,List<Integer>> v;
	private int[] from;
	private int[] route;
	private boolean[] isChecked;
	private int count;
	
	public SparseGragh(int vNum,List<List<Integer>> e){
		count = vNum;
		from = new int[vNum];
		route = new int[vNum];
		isChecked = new boolean[vNum];
		for(int i=0;i<vNum;i++){
			from[i]=-1;
			route[i]=-1;
			isChecked[i]=false;
		}
		
		v = new HashMap<Integer,List<Integer>>(vNum*2);
		for(List<Integer> list:e){
			int key = list.get(0);
			int value = list.get(1);
			if(!v.containsKey(key)){
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(value);
				v.put(key, temp);
			}else{
				v.get(key).add(value);
			}
			
			if(!v.containsKey(value)){
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(key);
				v.put(value, temp);
			}else{
				v.get(value).add(key);
			}
		}
	}
	
	@Override
	public List<Integer> getPath(int source, int target) {
		assert( 0<=source&&source<this.count);
		assert( 0<=target&&target<this.count);
		
		for(int i=0;i<count;i++){
			from[i]=-1;
			route[i]=-1;
			isChecked[i]=false;
		}
		
		//whether this two node is connected
		boolean isLinked = false;
		
		Stack<Integer> stack = null;
		
		Queue<Integer> q = new LinkedList<Integer>();
		isChecked[source] = true;
		route[source] = 0;
		q.add(source);
		while(!q.isEmpty()){
			int head = q.poll();
			List<Integer> temp = v.get(head);
			for(Integer son:temp){
				if(isChecked[son]!=true){
					from[son]=head;
					route[son] = route[head]+1;
					isChecked[son]=true;
					q.add(son);
					if(son==target){
						isLinked = true;
						q.clear();
						break;
					}
				}
			}
		}
		
		if(isLinked){
			stack = new Stack<Integer>();
			stack.push(target);
			while(from[target]!=-1){
				stack.push(from[target]);
				target = from[target];
			}
		}
		
		return stack;
	}

	@Override
	public void showPath(int source, int target) {
		Stack<Integer> stack = (Stack)getPath(source,target);
		
		if(stack ==null){
			System.out.println(source+" and "+target+" are not connected!");
			return;
		}
		
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()){
			sb.append(stack.pop()).append("-->");
		}
		System.out.println(sb.substring(0, sb.lastIndexOf("-->")));
	}
	
	@Override
	public List<Integer> getPathWithDepth(int source, int target) {
		assert( 0<=source&&source<this.count);
		assert( 0<=target&&target<this.count);
		
		for(int i=0;i<count;i++){
			from[i]=-1;
			route[i]=-1;
			isChecked[i]=false;
		}
		
		Stack<Integer> stack = null;
		
		isChecked[source] = true;
		
		dfs(source);
		
		if(isChecked[target]==true){
			stack = new Stack<Integer>();
			stack.push(target);
			while(from[target]!=-1){
				stack.push(from[target]);
				target = from[target];
			}
		}
		return stack;
	}

	private void dfs(int source) {
		for(Integer son:this.v.get(source)){
			if(isChecked[son]!=true){
				isChecked[son] = true;
				from[son] = source;
				dfs(son);
			}
		}
	}

	@Override
	public void showPathWithDepth(int source, int target) {
		Stack stack = (Stack)getPathWithDepth(source,target);
		if(stack==null){
			System.out.println(source+":"+target+"不聯通");
			return;
		}
		
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()){
			sb.append(stack.pop()).append("-->");
		}
		System.out.print(sb.substring(0, sb.lastIndexOf("-->")));
		
	}
	
	public static void main(String[] args){
		int vNum = 10;
		List<List<Integer>> v = new ArrayList<List<Integer>>();
		Random rand = new Random(System.currentTimeMillis());
		for(int i=0;i<vNum*2;i++){
			int source = Math.abs(rand.nextInt())%vNum;
			int target = Math.abs(rand.nextInt())%vNum;
			List<Integer> list = new ArrayList<Integer>(2);
			list.add(source);
			list.add(target);
			System.out.println(source+":"+target);
			v.add(list);
		}
		Gragh gragh = new SparseGragh(vNum,v);
		gragh.showPath(0, 4);
		gragh.showPathWithDepth(0, 4);
	}

}
