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
public class FindTheSumOfMulti5_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int target = 0, sum = 0, count = 0, i = 0;
		String show = "";
		while (true) {
			System.out.printf("Enter Integer: \n");
			target = s.nextInt();
			if (target < 5) {
				System.out.printf((target == -1) ? "Bye~!\n" : "Please input again!\n");
			} else {
				count = 0;
				sum = 0;
				for (i = 1; i <= target; i++) {
					if (i % 5 == 0) {
						count++;
						sum += i;
					}
				}
				System.out.printf("Interger From 1to 10%d\n "
				+ "The number of Multi 5:%d\n"
						+ "The Sum: %d\n", target,
						count, sum);
			}
		}

	}
}
