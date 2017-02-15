package com.hanbit.matrix;
/*
1   2   3   4   5
10   9   8   7   6
11  12  13  14  15
20  19  18  17  16
21  22  23  24  25
* */
public class Zigzag {
	public static void main(String[] args) {
		int k =0;
        int[][] arr = new int[5][5];
        for(int i=0;i<arr.length;i++){
        	for(int j=0;j<arr[i].length;j++){
        		//k+=arr[i][j];
        	if(i%2==1){
        		k--;
        		System.out.printf("%d",0);
        	}else{
        		k++;
        		System.out.printf("%d",k);
        	}
        	}
        	}
        	System.out.printf("\n"); }
     /**   int k = 1; // 넣을 값
        int flag = 1; // 스위치변수
        int i = 0; // 행
        int j = 0; // 열*/
    }

