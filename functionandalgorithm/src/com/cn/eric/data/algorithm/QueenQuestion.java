package com.cn.eric.data.algorithm;

public class QueenQuestion {
	
	public final static int QUEEN_NUMBER=8;
	private static int count = 0;
	private static int[] q = new int[QUEEN_NUMBER];
	

	public static void main(String[] args) {
		process(0);
		System.out.println(count);
	}
	
	public static void process(int colNum) {
		boolean[] rows = new boolean[QUEEN_NUMBER];
		for(int i=0;i<colNum;i++) {
			int d = colNum-i;  
	        if(q[i]-d >= 0)rows[q[i]-d]=true;  
	        if(q[i]+d <= QUEEN_NUMBER-1)rows[q[i]+d]=true; 
			rows[q[i]] = true;
		}
		for(int k=0;k<QUEEN_NUMBER;k++) {
			if(rows[k]!=true) {
				q[colNum] = k;
				process(colNum+1);
			}
		}
		if(colNum==QUEEN_NUMBER-1) {
			printBoard(q);
			count++;
			System.out.println("----"+count+"----");
		}
	}

	private static void printBoard(int[] q) {
		for(int i=0;i<QUEEN_NUMBER;i++) {
			for(int j=0;j<QUEEN_NUMBER;j++) {
				if(q[i]==j) 
					System.err.print(" 0 ");
				else
					System.out.print(" + ");
			}
			System.out.println();
		}
	}
}
