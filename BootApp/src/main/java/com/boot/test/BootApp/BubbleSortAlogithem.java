package com.boot.test.BootApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BubbleSortAlogithem implements SortingAlgorithem{

	@Override
	public int[] sort(int[] arr) {
		
		System.out.println("Using Bubble sort  ");
		return arr;
	}

}
