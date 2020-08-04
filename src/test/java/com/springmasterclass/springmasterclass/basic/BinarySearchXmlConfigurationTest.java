package com.springmasterclass.springmasterclass.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springmasterclass.springmasterclass.springin5easysteps.SpringMasterClassApplication;
import com.springmasterclass.springmasterclass.springin5easysteps.basic.BinarySearchImpl;

// Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXmlConfigurationTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() {
		int result = binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, result);
		// call method on BinarySearch
		// check if the value is correct
	}
}
