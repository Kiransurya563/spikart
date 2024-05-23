 package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.dto.CustomerDto;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	public void createCustomer(CustomerDto customerDto) {
		customerDao.createCustomer(customerDto);
	}
}