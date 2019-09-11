package com.javamath;

public class MaxandMinInArray {

	public static void main(String[] args) {
		int a[]={9,25,7,294,39};
		int max=a[0];
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if (max<a[i]) {
				max=a[i];
			}  else if (min>a[i]) {
				min=a[i];
			} 
			
		}
System.out.println("maximum :"+ max);
System.out.println("minimum :"+ min);
	}

}
