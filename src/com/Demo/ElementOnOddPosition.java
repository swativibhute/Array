package com.Demo;

public class ElementOnOddPosition {

	public static void main(String[] args) {
		
		//         0,1,2,3,4,5   //4,9,7
		int a[] = {4,5,9,3,7,8};
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("odd position");
		for (int i = 1; i < a.length; i=i+2) {
			System.out.println(a[i]);
		}
	}
}
