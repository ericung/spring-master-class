package com.springmasterclass.springmasterclass.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentScanJdbcConnection {

	public ComponentScanJdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
