package com.hanbit.loop_while;

import java.util.Scanner;

public class SeriesInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("If you want to stop, Type -1");
			System.out.println("Type Number :");
			int num = s.nextInt();
			if (num == -1) {
				System.out.println("INCORRECT");
				break;
			}
			sum = sum + num;
			System.out.println("Answer :" + sum);
		}
	}
}

