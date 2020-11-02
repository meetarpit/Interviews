package com.test.string;

import java.util.Scanner;

public class PrefectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any number");
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=2;i<=n;i++) {
		 if(n%i==0) {
			 sum=sum+i;
		 }
		}
		if(n==sum) {
			System.out.println("perfect");
		}
	}
}
