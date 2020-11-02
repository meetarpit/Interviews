package com.test.string;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {6,5,4,3,2,1};
		int flag=0;
		
	for(int i=1;i<a.length;i++) {
		
		int temp=a[i];
		int j=i-1;
		
		while(j>=0 && a[j]>temp) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
    		
	}
}
