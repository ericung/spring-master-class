package com.springmasterclass.springmasterclass.springin5easysteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springmasterclass.springmasterclass.componentscan.ComponentDAO;
import com.springmasterclass.springmasterclass.springin5easysteps.basic.BinarySearchImpl;
import com.springmasterclass.springmasterclass.springin5easysteps.cdi.SomeCdiBusiness;

@SpringBootApplication
public class SpringMasterClassCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringMasterClassCdiApplication.class); 
	
	public static void main(String[] args) {
		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringMasterClassCdiApplication.class, args);
		
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());
	}

}
