package com.javamath;
import java .util.Scanner;

import javax.management.StringValueExp;

public class ReverseEx {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
    // int no=12345;
      System.out.println("enter a number");
      
      int no=s.nextInt();
    int rem; int rev=0;
     while (no!=0) {
    	 rem=no%10;
    	  no=no/10;
    	 rev = rev*10+rem;
    	    
}
     System.out.println("reverse of a no : " +rev);
     int no1=1234;
     StringBuffer s1=new StringBuffer(String.valueOf(no1));
    System.out.println(s1.reverse());
		
	}
   

	

}
