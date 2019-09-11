package com.javamath;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		String yn;
		do {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first no");
		Double no1=s.nextDouble();
		System.out.println("enter second no");
		Double no2=s.nextDouble();
		System.out.println("enter the symbol(+,-,*,/)");
		String sym=s.nextLine();
		Double res=s.nextDouble();
		switch (sym) {
		case "+":
			res=no1+no2;
			System.out.println("addition of two numbers " +res);
			break;
			case "-":
				res=no1-no2;
				System.out.println("subtraction of two numbers " +res);
				break;
			case "*":
				res=no1*no2;
				System.out.println("multiplication of two numbers " +res);
				break;
			case "/":
				res=no1/no2;
				System.out.println("division of two numbers  " +res);
				break;
			default:
				System.out.println("No is not available");
			break;
		}
		System.out.println("Do you want to continue(if yes press y & if no press n)");
		 yn=s.next();
		
			
} while (yn.equals("y")|| yn.equals("Y"));

	}

}
