package com.test.string;

public class FindLargest {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int largest=Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		
		int h = Integer.MIN_VALUE;
		int sh = Integer.MIN_VALUE;
		for(int i:a) {
			if(i>h) {
				h=sh;
				sh=i;
				
			}
		}
		System.out.println(h+" "+sh);
		
		for(int i:a) {
			if(i<lowest) {
				lowest = i;
			}
		}
		
		for(int i:a) {
			if(i>largest) {
				largest = i;
			}
		}
		
		System.out.println(largest+" "+lowest);
		
		
	}
}
