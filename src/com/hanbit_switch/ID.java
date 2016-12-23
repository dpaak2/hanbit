package com.hanbit_switch;

import java.util.Scanner;

public class ID {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ssn = "";
		String gender = "";

		System.out.print("ID number: ");
		ssn = s.next();
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1': case'3':
			gender = "남자";
			break;
		case '2':	case'4':
			gender ="여자";
			break;
		case'5': case'6':
			gender="외국인";
			break;
		default:
			System.out.println("다시입력하세요.");
			return;
		}
		System.out.println("Gender: " + gender);

	}

}
