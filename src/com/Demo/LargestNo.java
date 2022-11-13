package com.Demo;

public class LargestNo {

	public static void main(String[] args) {


		int a[]= {117,1114,5,8,9,4,7,10,5,11,100};
		int largest=0;
		for (int i = 0; i < a.length; i++) {
			largest = a[i];
			for (int j = 0; j < a.length; j++) {
				if (a[j]>a[i]) {
					largest =a[j];
				}
			
			}
		}
		System.out.println(largest);

	}

}
