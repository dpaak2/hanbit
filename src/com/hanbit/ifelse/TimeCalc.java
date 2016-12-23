package com.hanbit.ifelse;
import java.util.Scanner;

public class TimeCalc {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
	System.out.print("초를 시간과 분으로 바꾸어 주는 프로그램입니다.");
	System.out.print("초를 입력해주세요 :");
	int second = scanner.nextInt();
	
	int hour=0, min=0, sec=0;
	//int h=0, m=0, s=0;
	hour=second/3600;
	second=second%3600;
	min=second/60;
	second=second%60;
	sec=second;

	if(second>=3600){
		hour=second/3600;
		second=second%3600;
		if(second>=60){
			min=second/60;
			second=second%60;
			sec=second;
			//시간 분 초
		}else{
			sec=second;
			//시간 초
		}
	}else if(second>=60){
		min=second/60;
		second=second%60;
		sec=second;
		//분, 초
	}else{
		sec=second;
		//초
	}
	
	System.out.println(hour+":"+min+":"+sec);
		
	}

}


