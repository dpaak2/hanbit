package com.hanbit.matrix;
import java.util.Scanner;
public class SumOfArray2 {
	public static void main(String[]args){
		Scanner s =new Scanner(System.in);
		System.out.println("덧셈하려는 숫자를 입력하세요. 단,5개까지만 가능");
		int i=0,sum=0;
		String result="";
		int[]arr=new int[5]; //값을 입력받을 숫자의 length를 정해주는것 []뒤에 오는것은 reference 값을 입력받는것
		/*arr[0]=s.nextInt();
		arr[1]=s.nextInt();
		arr[2]=s.nextInt();
		arr[3]=s.nextInt();
		arr[4]=s.nextInt();
		System.out.println(arr[i]+"+");*/
		
		for(i=0;i<arr.length;i++){
		arr[i]=s.nextInt();
		}
		for(i=0;i<arr.length;i++){
			sum+=arr[i];
			result=(arr[i]==arr.length)?arr[i]+"=":arr[i]+"+";
			System.out.print((i==arr.length-1)?arr[i]+"=":arr[i]+"+");
		}System.out.print(sum);
	} 
}

