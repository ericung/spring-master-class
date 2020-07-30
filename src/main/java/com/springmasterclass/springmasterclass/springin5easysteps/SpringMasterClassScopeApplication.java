package com.springmasterclass.springmasterclass.springin5easysteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springmasterclass.springmasterclass.springin5easysteps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringMasterClassScopeApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringMasterClassScopeApplication.class); 
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringMasterClassApplication.class);
		
		PersonDAO personDao = 
				applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = 
				applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
	}
}