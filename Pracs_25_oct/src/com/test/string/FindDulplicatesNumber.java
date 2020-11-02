package com.test.string;

import java.util.Arrays;

public class FindDulplicatesNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,3,4,4,5,6,7,8};
		
		int j=0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			a[j]=a[i];
			j++;
		}
		
		}
		a[j]=a[a.length-1];
		for(int i=0;i<=j;i++) {
			System.out.println(a[i]);
		}
	}
}
