package com.hanbit.branch_if;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("A 값을 입력하세요");
		int a = s.nextInt();
		System.out.println("B 값을 입력하세요");
		int b = s.nextInt();
		System.out.print("C 값을 입력하세요");
		int c = s.nextInt();

		int n1 = 0, n2 = 0, n3 = 0;

		if (a > b && a > c) {
			if (b > c) {
				n1 = a;
				n2 = b;
				n3 = c;
			}
			if (c > b) {
				n1 = a;
				n2 = c;
				n3 = b;
			}

		} else{
			if (b > a && b > c) {
				if (a > c) {
					n1 = b;
					n2 = a;
					n3 = c;
					if (c > a) {
						n1 = b;
						n2 = c;
						n3 = a;
					}
				} else {
					if (c > a && c > b) {
						if (a > b) {
							n1 = c;
							n2 = a;
							n3 = b;
							if (b > a) {
								n1 = c;
								n2 = b;
								n3 = a;
							}
						}
					}
				}
			}
		}

		System.out.println("가장 큰수부터 나열하면" + n1 + ">" + n2 + ">" + n3 + "입니다.");
	}

}