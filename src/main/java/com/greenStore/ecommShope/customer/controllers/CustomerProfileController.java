package com.greenStore.ecommShope.customer.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenStore.ecommShope.customer.models.CustomerProfile;

@RestController
@RequestMapping("/greenStoreCustomer")
public class CustomerProfileController {

	@GetMapping
	public List<CustomerProfile> getCustomerProfile() {

		List<CustomerProfile> customerProfiles = new ArrayList<CustomerProfile>();

		customerProfiles = Arrays.asList(new CustomerProfile("idOne", "nameOne"),
				new CustomerProfile("idOne", "nameOne"));

		return customerProfiles;

	}

	@PostMapping
	public String createCustomerProfile(@RequestBody CustomerProfile customerProfile) {

		return ("the details for below customer is saved : " + customerProfile);

	}

}
