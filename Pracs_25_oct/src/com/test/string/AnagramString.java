package com.test.string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "avaj";
		
         char[] ch1 = str1.toCharArray();
         char[] ch2 = str2.toCharArray();
         
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         
         if(Arrays.equals(ch1, ch2)) {
        	 System.out.println("ANAGRAM");
         }
         else {
        	 System.out.println("NO");
         }
         
		
	}
}
