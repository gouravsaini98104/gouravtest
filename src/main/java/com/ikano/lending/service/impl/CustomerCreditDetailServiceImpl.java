package com.ikano.lending.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ikano.lending.model.RevolvingCreditDetails;
import com.ikano.lending.model.UpdateCustomerCreditDetails;
import com.ikano.lending.service.CustomerCreditDetailService;

@Service
public class CustomerCreditDetailServiceImpl implements CustomerCreditDetailService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${lending-domain-service}")
	private String lendingDomainService;

	@Override
	public void updateCustomerCreditDetails(UpdateCustomerCreditDetails updatecustomerCreditDetails) {
		StringBuilder url = new StringBuilder(lendingDomainService).append("/customercreditdetails");

		restTemplate.put(url.toString(), updatecustomerCreditDetails);

	}

	@Override
	public RevolvingCreditDetails getCustomerCreditDetailById(Long customerId) {
		StringBuilder url = new StringBuilder(lendingDomainService).append("/customercreditdetails/")
				.append(customerId);

		return restTemplate.getForObject(url.toString(), RevolvingCreditDetails.class);

	}

}
