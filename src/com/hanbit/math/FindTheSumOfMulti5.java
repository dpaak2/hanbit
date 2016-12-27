package com.hanbit.math;

import java.util.Scanner;

/**
 * @FILE : FindTheSumOfMulti5.java
 * @DATE : 2016. 12. 27.
 * @AUTHOR: HAYUN KIM
 * @STORY : [결과] integer from 1 to [input] 1에서 [input]값 까지의 정수중에서 The number of
 *        Multi 5: ?5의 배수의 갯수:[input] The sum: ※If Input less than 1,please
 *        input again!
 */
public class FindTheSumOfMulti5 {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int target=0;
		while(true){
			System.out.println("Enter integer: ");
			target=s.nextInt();
			if(target<5){
				System.out.println("Plz, try agin!");
				if(target==-1){
					System.out.println("Bye");
				}
			}else{}
		}
	}
}
	