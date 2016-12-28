package com.hanbit.matrix;

import java.util.Scanner;

public class Money {
	public static void main(String[]args){
		
		Scanner s= new Scanner(System.in);
		int money=0,i=0;
		
		System.out.println("금액을 입력하세요. ");
		money =s.nextInt();
		System.out.println("요청금액: "+money);
		
		int [] moneyUnit ={50000,10000,5000,1000,500,100,50,10};
		System.out.println("요청금액: "+money);
			int mok =0;
			int nmg =0;
			String amount= "";
			for(i=0;i<moneyUnit.length;i++){
				switch(i){
				case 0:
					mok=money/moneyUnit[i];
					
					nmg=money%moneyUnit[i];
				break;
				case 1:
					mok=money/moneyUnit[i];
					money=nmg;
					nmg=money%moneyUnit[i];
					break;
				case 2:
					mok=money/moneyUnit[i];
					money=nmg;
					nmg=money%moneyUnit[i];
					break;
				case 3:
					mok=money/moneyUnit[i];
					money=nmg;;
					nmg=money%moneyUnit[i];
					break;
				case 4:
					mok=money/moneyUnit[i];
					money=nmg;
					nmg=money%moneyUnit[i];
					break;
				case 5:
					mok=money/moneyUnit[i];
					money=nmg;
					nmg=money%moneyUnit[i];
					break;
				case 6:
					mok=money/moneyUnit[i];
					money=nmg;
					nmg=money%moneyUnit[i];
					break;
				case 7:
					mok=money/moneyUnit[i];
					money=nmg;
					nmg=money%moneyUnit[i];
					break;
				}amount+=moneyUnit[i]+"\t"+mok+"개";
			}
			System.out.println(amount);
	}

}
