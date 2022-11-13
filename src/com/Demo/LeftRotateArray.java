package com.Demo;

import java.util.Arrays;

public class LeftRotateArray {

	public static void main(String[] args) {


		int a[]= {1,2,3,4,5};  //2,3,4,5,1
		
		for (int i = 0; i < 3; i++) {
			int first = a[0];
			int j;
			for ( j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];                        //2,3,4,1
			}
			a[j]=first;
			System.out.println(Arrays.toString(a));
		}
		
	}

}
