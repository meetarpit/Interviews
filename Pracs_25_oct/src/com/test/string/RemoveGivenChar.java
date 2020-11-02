package com.test.string;

import java.util.Scanner;

public class RemoveGivenChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any String");
		String str = sc.nextLine();
		System.out.println("please enter pos");
		int pos = sc.nextInt();
		System.out.println(removegivenChar(str,pos));
		
	}

	private static String removegivenChar(String str,int pos) {
		// TODO Auto-generated method stub
		return str.substring(0,pos) + str.substring(pos+1);
	}
}
