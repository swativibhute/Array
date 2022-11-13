package com.Demo;

import java.util.Arrays;

public class CopyArrayElement {

	public static void main(String[] args) {


		int a[] = {5,4,3,6,9,7,5};
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i]= a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
