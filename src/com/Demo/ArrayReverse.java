package com.Demo;

public class ArrayReverse {

	public static void main(String[] args) {


		int a[] = {1,2,3,4,5,6,7,8,9};
		for (int i = a.length-1; i >0; i--) {
			System.out.println(i+">> "+ a[i]);
		}
		int i=a.length-1;
		while(i>0) {
			System.out.println(i+" -"+a[i]);
			i--;
		}
	}

}
