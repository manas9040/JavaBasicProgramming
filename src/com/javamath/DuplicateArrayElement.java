package com.javamath;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArrayElement {

	public static void main(String[] args) {
	String[]a={"java","c","python","ruby","java","pearl","c","c#","c#"};
	for (int i = 0; i < a.length; i++) {
		for (int j =i+1; j < a.length; j++) {
			if ((a[i]==a[j])&&(i!=j)) {
			System.out.println("duplicate no:"+ a[j]);	
			}
			}
		}
/*	Set<String>arr=new HashSet<>();
	for (String str : a) {
		if (arr.add(str)==false) {
			System.out.println("duplicate :"+ str);
		}
		
	}*/
	HashMap<String, Integer> hm=new HashMap<>();
	 
	for (String words : a) {
		Integer count=hm.get(words);
		if(count == null){
        hm.put(words,1);
}
else {
	hm.put(words, ++count);

}
		for (Entry<String,Integer> wordcount : hm.entrySet()) {
			//String key=wordcount.getKey();
			//Integer i=wordcount.getValue();
			if (wordcount.getValue()>1) {
			System.out.println("duplicate : " +wordcount.getKey() );
				
			}
			
		}

		
	}
	
	
	
	
	
	}

}
