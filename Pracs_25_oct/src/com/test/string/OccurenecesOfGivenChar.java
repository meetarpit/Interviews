package com.test.string;

import java.util.Scanner;

public class OccurenecesOfGivenChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any String");
		String str = sc.nextLine();
		
		System.out.println("please enter any String");
		Character ch = sc.next().charAt(0);
		
		System.out.println(countOfChar( str, ch ));
		
	
		
	}

	private static int countOfChar(String str, Character ch) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
}
