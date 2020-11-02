package com.test.string;

import java.util.Scanner;

public class FirstNonRepatedChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any String");
		String str = sc.nextLine();
		
		for(Character ch :str.toCharArray()) {
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}
}
