package com.hanbit.loop_while;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("출력할 단을 입력하세요");
			int multiple = s.nextInt();
			System.out.println(multiple + "단");
			while (true) {
				if (multiple <= 0) {
					System.out.println("다시입력하세요!");
				}else{
					for (int i = 0; i <=9; i++) {
					int answer = multiple * i;
					System.out.println(multiple + "*" + i + "=" + answer);
				}}
				break;}
			
		}
	}
}
