package com.hanbit;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		//Variable Declation
		Scanner scanner = new Scanner(System.in);
		int price=0, count=0, total=0, rate=0, dc=0;
		// Value Assignment
		System.out.print("얼마예요?");
		price=scanner.nextInt();
		System.out.println(price + "원 입니다.");
		System.out.println("몇 개 드릴까요?");
		 count = scanner.nextInt();
		System.out.println(count + " 개 주세요.");
		 total = price * count;
		System.out.println(total + " 원 입니다.");
		System.out.println("비싸요, 깎아주세요");
		System.out.println("얼마를 깎아 드릴까요?");
		 rate = scanner.nextInt();
		System.out.println(rate + "% 깍아주세요");
		// Operation
		 dc =  total - (total*rate)/100;
		if (rate<= 10){
			
			System.out.print(dc + " 원 입니다.");			
		} else {
			System.out.print(dc+ "금액밖에 안되서 안 남아요, 안팝니다.");
		}
	}
}