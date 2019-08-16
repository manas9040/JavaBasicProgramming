package com.javamath;

import java.util.Scanner;

public class PrimeEx1 {
	 //int no=s.ne;
	 
 public boolean checkprimeno(){
 Scanner s = new Scanner(System.in);
 System.out.println("enter a no");
	 int no=s.nextInt();
	while(no<=1){
		return false;
		}
	for (int i = 2; i <no; i++) {
		if(no%i==0){
		return false;
		}
	}
	return true;
	}
 public static void main(String[] args) {
	 PrimeEx1 ex=new PrimeEx1();
	System.out.println("the no is prime : " +ex.checkprimeno());
	 }
}



