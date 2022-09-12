package com.demo.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.repo.CustomerRepo;

@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerRepo repo;
}
