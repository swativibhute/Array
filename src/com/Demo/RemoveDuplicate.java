package com.Demo;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int temp = 0;

		int a[] = { 4, 5, 3, 4, 2, 5, 4, 2, 3,1,8,9 };
		int b[] = new int[temp];

		for (int i = 0; i < a.length; i++) {
			temp = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j]!= 0) {
					if (a[i] == a[j]) {
						temp++;        // 1
						if (temp > 1) {
							a[j] = 0;
						}
					}
				}

			}
			if (temp == 1) {
				System.out.println(a[i]);
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
