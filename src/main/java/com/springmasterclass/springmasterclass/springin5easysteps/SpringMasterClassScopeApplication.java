package com.springmasterclass.springmasterclass.springin5easysteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springmasterclass.springmasterclass.springin5easysteps.scope.PersonDAO;

@SpringBootApplication
public class SpringMasterClassScopeApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringMasterClassScopeApplication.class); 
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				SpringApplication.run(SpringMasterClassScopeApplication.class, args);
		
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