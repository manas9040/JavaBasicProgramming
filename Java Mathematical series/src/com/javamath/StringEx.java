package com.javamath;

public class StringEx {
	public static void main(String[] args) {
	String s="my @@@@###%% na#####&&&&m*****e";
	s=s.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(s);

}
}
