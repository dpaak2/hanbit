package com.hanbit.matrix;

import java.util.Scanner;

/**
@FILE  : ReportCard.java
@DATE  : 2016. 12. 23.
@AUTHOR: HAYUN KIM
@STORY :다섯과목만 있는것으로 설정
 */
public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		int score = 0, total = 0, average = 0 ;
		System.out.print("Name:");
		name = s.next();
		int[]arr=new int[5];
		int i=0;
		for(i=0;i<arr.length;i++){
			arr[i] = s.nextInt();
			total += arr[i];
			if(arr[i]>100){
				System.out.println("다시 입력하세요");
			}else{
			total += arr[i];}
		}
		average = (total) / arr.length;
		System.out.printf("Average:%d\n",average);
		char grade = '0';
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else if (average >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf(
		"===========================================\n"+
		" 이름  국어  영어  수학 사회 과학 평균 학점\n"+
		"-------------------------------------------\n"+
		"%s     %d     %d    %d   %d   %d  %d %c \n" +
		"========================================="
		,name,arr[0],arr[1],arr[2],arr[3],arr[4],average,grade);
	}
}