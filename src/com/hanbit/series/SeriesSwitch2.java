package com.hanbit.series;

public class SeriesSwitch2 {
	public static void main(String[]args){
		int i =0,sum =0,sw =0;		
		
		while(true){
			i++;
			if(i%2==0){
				sw= -1;
				sum=sum+sw;
			if(i==100){break;}
			}
			
		}
		System.out.printf("=======================================\n"
						 +"1-2+3-4+5-6.....+99-100 까지 합계\n"
						 +"%d \n"
						 +"=======================================",sum);
	}

}
