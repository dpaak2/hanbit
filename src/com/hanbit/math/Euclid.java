package com.hanbit.math;

import java.util.Scanner;

public class Euclid {
	public static void main(String[] args) {
		int a, b, big, small = 0, mok = 0, nmg = 0, gcd = 0, ldm = 0;

		System.out.println("최대공약수, 최소공배수를 구하는 두 수 입력 ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Number A: ");
		a = sc.nextInt();
		System.out.println("Number B: ");
		b = sc.nextInt();
		if (a > b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		System.out.println("Big number:" + big);
		System.out.println("Small number:" + small);

		while (true) {
			nmg=big%small;
			if(nmg==0){break;}
			big=small;
			small=nmg;
//			if(nmg!=0){
//				big=small;
//				small=nmg;
//				nmg=big%small;
//			}
		}
		gcd=small;
		ldm=(a*b)/gcd;
		System.out.println("최대공약수: " + gcd);
		System.out.println("최소공배수: " + ldm);
	}
}
