package com.hanbit.matrix;

import java.util.Scanner;

public class LottoDraw3 {
	public static void main(String[] args) {
		int  i=0;
		String result="";
		int[] balls= new int[6];
		
		for(i=0;i<balls.length;i++){
			 balls[i]=(int) (Math.random()*45+1);
			 result+=(i==balls.length-1)?balls[i]+"":balls[i]+",";
		}
		System.out.printf(result);
		
	}
}
