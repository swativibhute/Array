package com.Demo;

public class DuplicateElement {

	public static void main(String[] args) {


		int a[]= {2,5,3,2,4,5,4};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			temp=0;
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					temp++;
					if(temp>1) {
						a[j]=0;
					}
				}
				
			}
			if(temp>1 && a[i]!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
