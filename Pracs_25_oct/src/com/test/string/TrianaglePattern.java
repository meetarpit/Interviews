package com.test.string;

import java.util.Scanner;

public class TrianaglePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number of rows");
		int n= sc.nextInt();
		int n1= n-2;
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				  if( k==1 || i == n || k==(i*2-1)) {
                      System.out.print("*");
                  }
                  else {
                      System.out.print(" ");
                  }
			}
			
			
		System.out.println();
		}
	}
}
