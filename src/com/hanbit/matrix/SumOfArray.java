package com.hanbit.matrix;

public class SumOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int i = 0, sum = 0;
		for (; i < arr.length; i++) {
			sum += arr[i];
			if(i<5){
				System.out.println(arr[i]+"+");
				
			}
		}
		System.out.printf("%d", sum);
	}
}
