package com.hanbit.branch_if;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String name = "";
		int age=0;
		double height = 0, weight = 0, bmi = 0;

		System.out.print("Name: ");
		name = s.next();
		System.out.print("Age: ");
		age = s.nextInt();		
		if(age<2){
			System.out.println("BMI지수의 참고치 정보는 2세 이상부터 제공됩니다. 정확한 수치를 입력해 주세요.");
			return;
		}
		
		System.out.println("Weight= " );
		weight = s.nextDouble();
		System.out.println(weight+"kg" );
		System.out.println("Height =" );
		height = s.nextDouble();
		System.out.println(height+"cm");

		bmi = weight / (height / 100 * height / 100);
		System.out.println("BMI = "+bmi);
		
		String result = "";


		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		

		System.out.println("Result: " + result);
		}
	}

