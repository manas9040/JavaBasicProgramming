package com.javamath;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayElement {

	public static void main(String[] args) {
	String[]a={"java","c","python","ruby","java","pearl","c"};
	for (int i = 0; i < a.length; i++) {
		for (int j =i+1; j < a.length; j++) {
			if ((a[i]==a[j])&&(i!=j)) {
			System.out.println("duplicate no:"+ a[j]);	
			}
			}
		}
	Set<String>arr=new HashSet<>();
	for (String str : a) {
		if (arr.add(str)==false) {
			System.out.println("duplicate :"+ str);
		}
		
	}
	
	
	
	
	
	}

}
