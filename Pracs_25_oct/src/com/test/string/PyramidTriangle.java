package com.test.string;

import java.util.Scanner;

public class PyramidTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number of rows");
		int n = sc.nextInt();
		int space =n;
		int mid = (n+1)/2;
		
		for(int i=1;i<=mid;i++) {
            
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();

		}
		for(int i=1;i<=mid;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space++;
			for(int k=n;k>=i;k--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}
