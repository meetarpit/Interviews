package com.test.string;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter rows");
		int n = sc.nextInt();
		int num=0;
	
		int space =n;
		
		for(int i=1;i<=n;i++) {
			num=i;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for(int k=1;k<=i;k++) {
				System.out.print(num);
				num++;
			}
			num--;
			num--;
			for(int k=1;k<i;k++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
			
		}
		
	}
	
}
