package com.springmasterclass.springmasterclass.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springmasterclass.springmasterclass.springin5easysteps.SpringMasterClassApplication;
import com.springmasterclass.springmasterclass.springin5easysteps.basic.BinarySearchImpl;
import com.springmasterclass.springmasterclass.springin5easysteps.cdi.SomeCdiBusiness;
import com.springmasterclass.springmasterclass.springin5easysteps.cdi.SomeCdiDao;

// Load the context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	// Inject Mock
	@InjectMocks
	SomeCdiBusiness business;
	
	// Create Mock
	@Mock
	SomeCdiDao daoMock;
	
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		int result = business.findGreatest();
		assertEquals(4, result);
	}
	
	@Test
	public void testBasicScenario_noElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		int result = business.findGreatest();
		assertEquals(Integer.MIN_VALUE, result);
	}
	
	@Test
	public void testBasicScenario_EqualElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
		int result = business.findGreatest();
		assertEquals(2, result);
	}
}
