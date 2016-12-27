package com.hanbit.math;
import java.util.Scanner;
/**
 * @FILE : NumberGolf.java
 * @DATE : 2016. 12. 27.
 * @AUTHOR: HAYUN KIM
 * @STORY : 최단횟수로 맞추느 사람이 승리하는 게임 -1 stop you can integer 1-100
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int target = (int) (Math.random() * 100 + 1);
		System.out.println("TARGET :" + target);
		int bet = 0, count = 0;
		while (true) {
			System.out.println("Enter Integer (1~100):");
			bet = s.nextInt();
			count++;
			if (target == bet) {
				System.out.println("Correct!Good job!");
				System.out.println("Betting amount: " + count);
				return;
			} else {
				System.out.println("Incorrect! Try again!");
				//String result=(target > bet)?"Too small... Guess more!":"Too big!!! Guess again!";
				System.out.println((target > bet)?"Too small... Guess more!":"Too big!!! Guess again!");
//				if (target > bet) {
//					System.out.println("Too small... Guess more!");
//				} else {
//					System.out.println("Too big!!! Guess again!");
//				}
			}

		}
	}

}
