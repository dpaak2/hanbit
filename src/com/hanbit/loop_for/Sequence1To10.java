package com.hanbit.loop_for;
/**
@FILE  : Series1To10.java
@DATE  : 2016. 12. 26.
@AUTHOR: HAYUN KIM
@STORY :
 */
public class Sequence1To10 {
	public static void main(String[]args){
		int sum =0;
		for(int num=0;num<11;num++){
			sum+=num;
		}
		System.out.println("SUM: "+sum);
	}
}
