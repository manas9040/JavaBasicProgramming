package com.javamath;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;

public class DublicatewordsinString {

	public static void main(String[] args) {
		String str ="java is not the best there is more equivalent "
				+ "lag.  best than java";
		String [] arr= str.split(" ");
		HashSet<String> hs =new HashSet<>();
		
			
			
			for (String str1 : arr) {
				if (hs.add(str1)==false) {
					System.out.println(" duplicate : " +str1);
				} 
				
				
			}

			
	
		
		
		
				
			}
			
		

	}


