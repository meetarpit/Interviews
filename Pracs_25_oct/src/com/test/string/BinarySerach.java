package com.test.string;

import java.util.Scanner;

public class BinarySerach {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		int n=a.length;
		int beg=1;
		int end = n-1;
		int mid=(beg+end)/2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter item");
		int item=sc.nextInt();
		

		while(beg<=end && a[mid]!=item) {
		
			if(a[mid]<item) {
				beg = mid+1;
			}
			else {
				end = mid-1;
			}
			mid=(beg+end)/2;
		}
		
		if(a[mid]==item) {
			System.out.println("item found");
		}
		else {
			System.out.println("NOT FOUND");
		}
		
	}
}
