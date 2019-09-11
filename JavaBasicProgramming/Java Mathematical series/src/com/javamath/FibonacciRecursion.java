package com.javamath;

public class FibonacciRecursion {
	static int a=0,b=1,c;

	public static void main(String[] args) {
		
		FibonacciRecursion fr= new FibonacciRecursion();
		fr.printFB(10);
	}
	void printFB(int i){
		if(i>=1){
		c=a+b;
		System.out.println(" " +c);
		a=b;
		b=c;
		printFB(i-1);
		
		}
		
	}

}
