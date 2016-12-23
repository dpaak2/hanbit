package com.hanbit_switch;

import java.util.Scanner;

public class ShowMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Year :");
		int year = s.nextInt();
		System.out.print("Month :");
		int month = s.nextInt();
		System.out.println("Date :");
		String date = "";
		String result = "";
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			date = "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			date = "30";
			break;
		case 2:
			if (year % 400 == 0) {
				date = "29";
			} else if (year % 100 == 0) {
				date = "28";
			} else if (year % 4 == 0) {
				date = "29";
			} else {
				date = "28";
			}
			break;
		}
		System.out.println(year + "년" + month + "월은" + date + "일까지입니다.");
	}
}
