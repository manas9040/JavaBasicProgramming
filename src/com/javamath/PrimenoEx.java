package com.javamath;

import java.util.Scanner;

public class PrimenoEx {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
	int no=s.nextInt();
	int temp=0;
	for (int i = 2; i <no-1; i++) {
		while(no%i==0){
			temp=temp+1;
			}
		}
	if (temp>0) {
  System.out.println("no is not prime");
	}
	else {
		System.out.println("no is prime");
	}
		
	}

	}


