package com.boot.test.BootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    
	@Autowired
	SortingAlgorithem b;
	
	

	public void setB(SortingAlgorithem b) {
		this.b = b;
	}



	public int binarySearch(int[] arr, int num) {
		
		int[] a ;
		
		int[] sortedArr = b.sort(arr);
		
		//Code for binary search
		
		
		return 2;
	}
	
}
