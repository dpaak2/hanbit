package com.hanbit.branch_if;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		int korean = 0, english = 0, math = 0, total = 0, average = 0;
		System.out.print("Name:");
		name = s.next();

		System.out.print("Korean=");
		korean = s.nextInt();
		System.out.print("English=");
		english = s.nextInt();
		System.out.print("Math=");
		math = s.nextInt();

		total = korean + english + math;
		average = (total) / 3;
		
		char grade=0;
        if(average>=90){
        	grade='A'; 
		}else if(average>=80){
			grade='B';
		}else if(average>=70){
			grade='C';
		}else if(average>=60){
			grade='D';
		}else{
			grade='F';
		}

		System.out.println("Name:" + name);
		System.out.println("Total=" + total);
		System.out.println("Average=" + average);
		System.out.println("Grade "+ grade);
		
	}
}