package com.hanbit.math;
import java. util.Scanner;
public class FindTheSumOf5Numbers2 {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int sum =0, count =0, n=0;
		System.out.println("Enter number");
		while(count<5){
				n=s.nextInt();
				System.out.printf("number: %d\n",n);
				sum+=n;
				count++;}
				System.out.printf("%s%d","SUM =",sum); 
	}
}
