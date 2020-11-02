package com.test.string;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6};
		
	
		System.out.println(findMissingNumber(a.length+1,a));
		
		
	}

	private static int findMissingNumber(int n, int a[]) {
		// TODO Auto-generated method stub
		int as =0;
		
		for(int i=0;i<a.length;i++) {
			as = as + a[i];
		}
		int es = n*(n+1)/2;
	    System.out.println(as+" "+es);
		return es-as;
	}
}
