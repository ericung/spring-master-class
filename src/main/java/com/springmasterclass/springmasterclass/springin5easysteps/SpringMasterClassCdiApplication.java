package com.springmasterclass.springmasterclass.springin5easysteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springmasterclass.springmasterclass.springin5easysteps.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan
public class SpringMasterClassCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringMasterClassCdiApplication.class); 
	
	public static void main(String[] args) {
		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringMasterClassApplication.class))
		{
			SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
			
			LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());
		}
	}

}
