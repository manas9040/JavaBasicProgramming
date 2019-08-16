package com.javamath;

import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a no");
		int no=s.nextInt();
		int fact=1;
		for (int i =1; i <=no; i++) {
			fact=fact*i;
			}
		System.out.println(fact);
		
		


	}

}
