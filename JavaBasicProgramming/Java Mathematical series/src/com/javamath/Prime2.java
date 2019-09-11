package com.javamath;

public class Prime2 {

	public static void main(String[] args) {
		int no=4;
		boolean isprime=true;
		for (int i = 2; i <no; i++) {
			
				if (no%i==0) {
				isprime=false;
				break;
				}
				}
			
		
		if(isprime){
			System.out.println(no+ " No. is prime");
		}
		else {
			System.out.println("the no.is not prime");
		}
			
		}

	}


