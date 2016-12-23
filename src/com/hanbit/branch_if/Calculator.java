package com.hanbit.branch_if;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Calculator ===");
		System.out.println("First number : ");
		double fno = scanner.nextDouble();
		System.out.println("Opcode :");
		String opcode = scanner.next();
		System.out.println("Second Number:");
		double sno = scanner.nextDouble();
		double result = 0.0;
		if (opcode.equals("+")) {
			result = fno + sno;
		} else if (opcode.equals("-")) {
			result = fno - sno;
		} else if (opcode.equals("*")) {
			result = fno * sno;
		} else if (opcode.equals("/")) {
			result = fno / sno;
		} else {
			System.out.println("ERROR");
			return;
		}
		System.out.println("Result :" + result);
	}

}