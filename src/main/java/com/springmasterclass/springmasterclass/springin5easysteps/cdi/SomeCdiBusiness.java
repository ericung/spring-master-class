package com.springmasterclass.springmasterclass.springin5easysteps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCDIDAO) {
		this.someCdiDao = someCDIDAO;
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCdiDao.getData();
		for(int value: data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		
		return greatest;
	}
}
