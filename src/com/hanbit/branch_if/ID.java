package com.hanbit.branch_if;

import java.util.Scanner;

public class ID {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ssn="";
		String gender="";
			
		System.out.print("ID number: ");
		ssn = s.next();

		char ch= ssn.charAt(7);
		
		if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
			System.out.println("다시입력하세요");
			return;
		}
		
		
		
		
		if (ch=='1'||ch=='3'){
			gender="남자";
		}else if(ch=='2'||ch=='4'){
				gender="여자";
			
		} else if(ch=='5'||ch=='6'){ 
			
			gender="외국인";}
		else{
			System.out.println("다시입력하세요");
			}
		
		System.out.println("Gender: "+gender);
		
	
		
	}
	

}

