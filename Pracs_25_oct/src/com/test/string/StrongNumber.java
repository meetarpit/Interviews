package com.test.string;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any number");
		int n = sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(n>0) {
			int loop = 1,fact=1;
			int re = n%10;
			while(loop<=re) {
				fact = fact*loop;
				loop++;
			}
			sum = sum+fact;
			n=n/10;
		}
		System.out.println(n);
		if(temp==sum) {
			System.out.println("armstrong");
		}
	}
}
