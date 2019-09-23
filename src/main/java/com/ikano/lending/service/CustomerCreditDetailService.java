package com.ikano.lending.service;

import com.ikano.lending.model.RevolvingCreditDetails;
import com.ikano.lending.model.UpdateCustomerCreditDetails;

public interface CustomerCreditDetailService {

	void updateCustomerCreditDetails(UpdateCustomerCreditDetails updatecustomerCreditDetails);

	RevolvingCreditDetails getCustomerCreditDetailById(Long customerId);

}
