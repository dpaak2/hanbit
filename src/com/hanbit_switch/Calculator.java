package com.hanbit_switch;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Calculator ===");
		System.out.println("First number : ");
		int fno = scanner.nextInt();
		System.out.println("Opcode :");
		String opcode = scanner.next();
		System.out.println("Second Number:");
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
			System.out.println("ERROR");
			return;
		}
		System.out.println("Result :" + result);
	}

}