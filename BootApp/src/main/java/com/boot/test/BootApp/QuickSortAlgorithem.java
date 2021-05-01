package com.boot.test.BootApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithem implements SortingAlgorithem {

	@Override
	public int[] sort(int[] arr) {
        
		
		System.out.println("Using Quick sort ");
		return arr;
	}

}
