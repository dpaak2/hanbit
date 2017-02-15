package com.hanbit.matrix;
/*
0    0    1    0    0   
0    2    3    4    0   
5    6    7    8    9   
0    10    11    12    0   
0    0    13    0    0
 * */
public class Diamond {
	public static void main(String []args){
	
	int len=5, col= len, row= len, val=0, start=0, end=0, i=0, j=0; //배열에 저장할 변수
	int[][] arr = new int[ col][ row];
	start=3; //열의 시작 위치
	end=3; //열의 끝 위치
	for(i=1;i<=5;i++){
	for(j=start;j<=end; j++){
	val++;
	arr[i-1][j-1]=val;
	}
	if(i>=3){
	start++;
	end--;

	}else{
	start--;
	end++;
	}
	}
	for(i=0; i<5; i++){ 
	System.out.printf("%s","\n");
	for(j=0; j<5; j++){
	System.out.printf("%d \t",arr[i][j]);
	}
	}
}
	
	}