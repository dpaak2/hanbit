package com.hanbit.series;
import java.util.Scanner;
/**
 * @FILE : Fibonacci.java
 * @DATE : 2016. 12. 26.
 * @AUTHOR: HAYUN KIM
 * @STORY :1, 1, 2, 3, 5, 8, 13, 21, 34, 55 의 합
 */
public class Fibonacci2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 1, b = 1, c = 2, sum=2;
		System.out.print("Enter the last index of Term"
				+"(Start of index is 1)");
		int last=s.nextInt();
		for (int i=3;i<=last;i++) {
			c = a + b;
			sum+=c;
			a=b;
			b=c;
			if(i==last){break;}
			System.out.printf("a=%d,b=%d,c=%d\n",a,b,c);
		}
		System.out.println("Fibonacci SUM:"+sum);
	}
}
