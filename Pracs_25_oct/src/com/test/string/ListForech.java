package com.test.string;

import java.util.Arrays;
import java.util.List;

public class ListForech {

	public static void main(String[] args) {
		

		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		int largest=Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		
		list.stream().filter(i->i>3).forEach(i->{
			System.out.println(i);
		});
	}
}
