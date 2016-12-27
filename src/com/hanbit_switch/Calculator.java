package com.hanbit_switch;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("%s","=== Calculator ===\n");
		System.out.printf("%s","First number :\n");
		int fno = scanner.nextInt();
		System.out.printf("%s","Opcode :\n");
		String opcode = scanner.next();
		System.out.printf("%s","Second Number:\n");
		int sno = scanner.nextInt();
		int result = 0;
		switch (opcode) {
		case "+":
			result = fno + sno;
			break;
		case "-":
			result = fno - sno;
			break;
		case "*":
			result = fno * sno;
			break;
		case "/":
			result = fno / sno;
			break;
		case "%":
			result= fno %sno;
			break;
		default :
			System.out.printf("%s","ERROR!\n");
			return;
		}
		System.out.printf("%s%d","Result :" ,result);
	}

}