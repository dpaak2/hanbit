package com.hanbit.math;
import java. util.Scanner;
public class FindTheSumOf5Numbers {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int sum =0, count =0, n=0;
		System.out.println("Enter number");
		while(true){
			if(count<5){
				n=s.nextInt();
				System.out.println("number: "+n);
				sum+=n;
				count++;}else{
				System.out.println("SUM ="+sum); 
				return;}
		}
	}
}
