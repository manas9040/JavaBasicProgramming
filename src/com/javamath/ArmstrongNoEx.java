package com.javamath;
import java.util.Scanner;
public class ArmstrongNoEx {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter a number");
		int no=s.nextInt();
		int temp=no;
		int rem,sum=0;
		while(temp!=0){
			rem=temp%10;
			temp=temp/10;
			
			sum=sum+rem*rem*rem;
			
		}
		if (no==sum) {
			System.out.println("this is an armstrong no:" +no);
			
		}
		else{
			System.out.println("this isn't an armstromg no:" +no);
		}

	}

}
