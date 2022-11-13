package com.Demo;

import java.util.Arrays;

public class SecLargestNo {

	public static void main(String[] args) {

		int temp=0;
		int a[]= {5,1,7,3,6,9,5,2};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];  //5
					a[i]=a[j];  //1
					a[j]=temp; //5
				}
			}
		}
		int largest =a[a.length-2];
		System.out.println(Arrays.toString(a));
		System.out.println("2nd largest>>"+largest);
		int smallest = a[0];
		System.out.println("smallest >>"+smallest);
	}

}
