package com.hanbit;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		//Variable Declation
		Scanner scanner = new Scanner(System.in);
		int price=0, count=0, total=0, rate=0, dc=0;
		// Value Assignment
		System.out.printf("%s\n","얼마예요?");
		price=scanner.nextInt();
		System.out.printf("%d 원 입니다.\n",price);
		System.out.printf("%s\n","몇 개 드릴까요?");
		 count = scanner.nextInt();
		System.out.printf("%d 개 주세요.\n",count);
		 total = price * count;
		System.out.println(total + " 원 입니다.");
		System.out.printf("%s\n%s",
				 "비싸요, 깎아주세요.","얼마를 깎아 드릴까요?");
		 rate = scanner.nextInt();
		System.out.println( rate+"% 깍아주세요");
		// Operation
		 dc =  total - (total*rate)/100;
		if (rate<= 10){
			
			System.out.printf("%d%s",dc, " 원 입니다.");			
		} else {
			System.out.print(dc+ "금액밖에 안되서 안 남아요, 안팝니다.");
		}
	}
}