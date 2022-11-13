package com.Demo;

public class FrequencyOfElement {

	public static void main(String[] args) {


		int a[]= {4,5,8,4,5,6,9,7,5,4};
		int b[]=new int[a.length];
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			temp=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					temp++;
					if(temp>1) {
						b[j]=-1;
					}
				}
			}
			if(b[i]==0) {
				System.out.println(a[i]+" >>"+temp);
			}
		}
	}

}
