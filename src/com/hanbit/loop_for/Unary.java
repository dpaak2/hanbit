package com.hanbit.loop_for;
/**
 * @FILE : SumOneToFive.java
 * @DATE : 2016. 12. 23.
 * @AUTHOR: HAYUN KIM
 * @STORY : 1부터 5까지의 합 구하기(differ=1)
 */
public class Unary {
	public static void main(String[] args) {
		int sum = 0;
		for (int num = 0;num < 5 ; num++) {
			System.out.println("NUM :" + num);
			sum += num;
		}
		System.out.println("합은" + sum + "입니다");
	}
}
