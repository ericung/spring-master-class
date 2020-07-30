package com.springmasterclass.springmasterclass.springin5easysteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springmasterclass.springmasterclass.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.springmasterclass.springmasterclass.componentscan")
public class SpringMasterClassComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringMasterClassComponentScanApplication.class); 
	
	public static void main(String[] args) {
		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringMasterClassApplication.class);
		
		ComponentDAO componentDAO = 
				applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		
	}

}
