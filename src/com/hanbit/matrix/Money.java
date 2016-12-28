package com.hanbit.matrix;

import java.util.Scanner;

public class Money {
	public static void main(String[]args){
		
		Scanner s= new Scanner(System.in);
		int money=0,i=0;
		
		System.out.println("금액을 입력하세요. ");
		money =s.nextInt();
		System.out.println(money+"원");
		
		int [] moneyUnit ={50000,10000,5000,1000,500,100,50,10};
		
			int mok =0;
			int nmg =0;
			System.out.println("Money:"+money);
			for(i=0;i<moneyUnit.length;i++){
				switch(moneyUnit[i]){
				
				case 1:
					money=money%moneyUnit[i];
					mok=money/50000;
					nmg=money%50000;
					nmg=money;
				break;
			
				case 2:
					money=money%moneyUnit[i];
					mok=money%10000;
					nmg=mok%10000;
					break;
				case 3:
					money=money%moneyUnit[i];
					mok=money%5000;
					nmg=mok%5000;
					break;
				case 4:
					money=money%moneyUnit[i];
					mok=money%1000;
					nmg=mok%1000;
					break;
				case 5:
					money=money%moneyUnit[i];
					mok=money%500;
					nmg=mok%500;
					break;
				case 6:
					money=money%moneyUnit[i];
					mok=money%100;
					nmg=mok%100;
					break;
				case 7:
					money=money%moneyUnit[i];
					mok=money%50;
					nmg=mok%50;
					break;
				case 8:
					money=money%moneyUnit[i];
					mok=money%10;
					nmg=mok%10;
						break;
				default:
					money=money%moneyUnit[i];
					break;
				}
			}
		System.out.println("5만원 :"+mok);
		System.out.println("1만원 :");
		System.out.println("5천원 :");
		System.out.println("1천원 :");
		System.out.println("500원 :");
		System.out.println("100원 :");
		System.out.println("50원 :");
		System.out.println("10원 :");
	}

}
