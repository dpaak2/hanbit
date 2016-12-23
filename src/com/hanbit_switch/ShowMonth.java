package com.hanbit_switch;
import java.util.Scanner;
/**
@FILE  : ShowMonth.java
@DATE  : 2016. 12. 23.
@AUTHOR: HAYUN KIM
@STORY : 
[1]연도를 4로 나눈값이 0 이고,
그러나 해당 연수가 100으로 나누어 떨어지지 않으면 윤년이다.
[2]연도를 4로 나눈값이 0 이고,
그러나 해당 연수가 100으로 나누어 떨어지는데, 윤년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
 */
public class ShowMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Year :");
		int year = s.nextInt();
		System.out.print("Month :");
		int month = s.nextInt();
		int date = 0;
		switch (month) {
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10:case 12:
			date = 31;
			break;
		case 4:	case 6:	case 9:	case 11:
			date = 30;
			break;
		case 2:
			if(year%4!=date && year%400!=date){
					System.out.println("평년입니다.");
				}else{
					System.out.println("윤년입니다.");
				}
		break;
			default : System.out.println("Wrong Month!");
			return;
		}
		System.out.println(year + "년" + month + "월은" + date + "일까지입니다.");
	}
}
