package com.javamath;
import java.util.Scanner;

public class PalendromeEx {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		
		
		int no=s.nextInt();
		int temp=no;
		int rem,rev=0;
		while (temp!=0){
			rem=temp%10;
			temp=temp/10;
			rev=rev*10+rem;
			}
		if (no==rev) {
			System.out.println("the no is palendrome "+no);
			
		}
		else {
			System.out.println("it's not a palendrome no." +no);
		}
	
	}

	

}
