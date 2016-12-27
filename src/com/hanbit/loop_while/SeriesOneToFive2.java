package com.hanbit.loop_while;

/**
@FILE  : SumOneToFive.java
@DATE  : 2016. 12. 23.
@AUTHOR: HAYUN KIM
@STORY : 1부터 5까지의 합 구하기(differ=1)
 */
public class SeriesOneToFive2 {
public static void main (String[]args){
	int sum = 0;
	int num = 1;
	while(num<=20){
		//System.out.println("num :"+num);
		sum +=num;
		num +=2;
	
	}
	System.out.println("합은"+sum+"입니다");
}
}
