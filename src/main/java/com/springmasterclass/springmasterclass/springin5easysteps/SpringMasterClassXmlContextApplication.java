package com.springmasterclass.springmasterclass.springin5easysteps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmasterclass.springmasterclass.springin5easysteps.basic.BinarySearchImpl;
import com.springmasterclass.springmasterclass.springin5easysteps.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class SpringMasterClassXmlContextApplication {

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")){
		
			XmlPersonDAO personDAO = 
					applicationContext.getBean(XmlPersonDAO.class);
		
			System.out.println(personDAO);

		}
	}

}
