package com.hanbit.loop_while;

import java.util.Scanner;

/**
@FILE  : ReportCard.java
@DATE  : 2016. 12. 23.
@AUTHOR: HAYUN KIM
@STORY :
 */
public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		int score = 0, total = 0, average = 0, sub = 0;
		System.out.println("If you want to stop,Type -1");
		System.out.println("If the number of subject is 6, Auto quit!! ");
		System.out.print("Name:");
		name = s.next();
		while (sub<6) {
			System.out.print("Score=");
			score = s.nextInt();
			total += score;
			sub++;
		}
		average = (total) / sub;
		char grade = '0';
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else if (average >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Name:" + name);
		System.out.println("Total=" + total);
		System.out.println("Average=" + average);
		System.out.println("Grade " + grade);
	}
}