package com.test.string;

import java.util.Scanner;

public class RightSideTrangle {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("please enter the number of rows");
	 int n = sc.nextInt();
	
	 for(int i=0;i<=n;i++) {
		 for(int j=n-1;j>=i;j--) {
         System.out.print(" ");			 
		 }
		 for(int k=0;k<=i;k++) {
			 System.out.print("*");
		 }
		 System.out.println("");
	 }
	 
	 for(int i=0;i<=n;i++) {
		 for(int k=0;k<=i;k++) {
         System.out.print(" ");			 
		 }
		 for(int j=n-1;j>=i;j--) {
			 System.out.print("*");
		 }
		 System.out.println("");
	 }
	 
	 for(int i=0;i<=n;i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 for(int i=n;i>=0;i--) {
		 for(int j=0;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 

	
	}
}
