package com.springmasterclass.springmasterclass.springin5easysteps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springmasterclass.springmasterclass.springin5easysteps.basic.BinarySearchImpl;
import com.springmasterclass.springmasterclass.springin5easysteps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringMasterClassPropertiesApplication {

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringMasterClassPropertiesApplication.class)){
		
			SomeExternalService service = new SomeExternalService();
		
			System.out.println(service);
		}
	}

}
