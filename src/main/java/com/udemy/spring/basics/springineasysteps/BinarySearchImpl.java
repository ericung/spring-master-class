package com.udemy.spring.basics.springineasysteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm quickSortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor)
	{
		int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		
		// Return the result
		return 3;
	}
}
