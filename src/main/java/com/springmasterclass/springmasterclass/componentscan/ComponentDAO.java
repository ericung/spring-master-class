package com.springmasterclass.springmasterclass.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	
	@Autowired
	ComponentScanJdbcConnection jdbcConnection;

	public ComponentScanJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentScanJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
