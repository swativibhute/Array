package com.Demo;

import java.util.Arrays;

public class AscendingNo {

	public static void main(String[] args) {

		int temp=0;
		int a[]= {4,5,8,6,7,3,2,4};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
