package com.Demo;
//find odd or even numbers in array but it would be print only one time/////////////////////
public class EvenPosition {

	public static void main(String[] args) {
			//     0,1,2,3,4,5,6,7,8,9,10
		int a[] = {5,4,8,6,3,4,5,2,5,2};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			temp=0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]!=0) {
					if(a[i]==a[j]) {
						temp++;         //1
						if (temp>1) {
							a[j]=0;
						}
						else {
							if (a[i]%2==0) {
								System.out.println(a[i]);
							}
						}
					}
				}
				
			} 
		}
	
	}

}
