package com.hanbit.math;
import java.util.Scanner;
/*
 * 로또볼 추첨
 * 1~45 까지 랜덤 숫자
 * 볼갯수는 총 6개
 * 중복 허용
 * 출력음 [5,23,23,40,19,22]
 */
public class LottoDraw {
	public static void main(String[]args){
		Scanner s = new Scanner (System.in);
		System.out.println("Random number 1~45");
		int count=0;
		while(count<6){
			count++;
			int target = (int) (Math.random()*45+1);
				switch (count){
				case  1:
				System.out.println("Ball 1: "+target);
				break;
				case 2:
					System.out.println("Ball 2: "+target);
					break;
				case 3:
					System.out.println("Ball 3: "+target);
					break;
				case 4:
					System.out.println("Ball 4: "+target);
					break;
				case 5:
					System.out.println("Ball 5: "+target);
					break;
				case 6:
					System.out.println("Ball 6: "+target);
					break;
			}
		}
		
	}

}
