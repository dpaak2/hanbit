package com.hanbit.matrix;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("y= yeah,n=no");
		String y = s.next();
		String result = "";
		System.out.println((y.equals("y"))?"yeah":"no");
	}
}
