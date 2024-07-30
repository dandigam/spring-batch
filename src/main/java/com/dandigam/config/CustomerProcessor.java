package com.dandigam.config;


import org.springframework.batch.item.ItemProcessor;

import com.dandigam.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
		
		if(item.getId() == 10) {
		item.setFirstName(null);
		item.setFirstName(item.getFirstName().concat("Dandigam"));
		}
		
		return item;
	}

}
