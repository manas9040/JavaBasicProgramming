package com.javamath;

public class MaxnoinArray {

	public static void main(String[] args) {
		int a[]={3,45,1023,2,};
		int max=a[0];
		//int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if (max<a[i]) {
				max=a[i];
			//	System.out.println("Maximum no :"+ max);
			}
		}
	
		System.out.println("Maximum no :"+ max);

	}

}
