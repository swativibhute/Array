package com.Demo;

public class CountElement {

	public static void main(String[] args) {


		int a[] = {2,8,5,4,5,6};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count++;
		}
		System.out.println("no of element >>"+count);
		
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum =sum+a[i];
		}
		System.out.println("sum of elemt>>"+sum);
	}

}
