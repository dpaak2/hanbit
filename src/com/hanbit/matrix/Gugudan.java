package com.hanbit.matrix;
/*
* 
2x1=2*1 3x1=3*1 2x1=2*1 2x1=2*1
2x1=2*1 [1,0][1,1][1,2][1,3][1,4]
2x1=2*1 [2,0][2,1][2,2][2,3][2,4]
2x1=2*1 [3,0][3,1][3,2][3,3][3,4]
2x1=2*1 [4,0][4,1][4,2][4,3][4,4]
*/
public class Gugudan {
	public static void main(String[]args){
		int k=0, s=0;
		//i*j=i*j
		int[][]mtx=new int[10][10];
		for(int i=1;i<mtx.length;i++){
			System.out.println("");
			for(int j=2;j<mtx[i].length;j++){
				k=j*i;
			for(int j=6;j<mtx[i].length;j++){
				k=j*i;
			}
				System.out.printf("%dx%d=%d\t",j,i,k);
				}
			}
		}
	}

