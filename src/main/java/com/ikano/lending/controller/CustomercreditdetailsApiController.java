package com.ikano.lending.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ikano.lending.api.CustomercreditdetailsApi;
import com.ikano.lending.model.RevolvingCreditDetails;
import com.ikano.lending.model.UpdateCustomerCreditDetails;
import com.ikano.lending.service.CustomerCreditDetailService;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-13T04:00:48.789Z")

@Controller
public class CustomercreditdetailsApiController implements CustomercreditdetailsApi {

	@Autowired
	private CustomerCreditDetailService customerCreditDetailService;

	public ResponseEntity<RevolvingCreditDetails> customercreditdetailsCustomerIdGet(
			@ApiParam(value = "", required = true) @PathVariable("customerId") Long customerId) {

		RevolvingCreditDetails revolvingCreditDetails = customerCreditDetailService
				.getCustomerCreditDetailById(customerId);

		return new ResponseEntity<>(revolvingCreditDetails, HttpStatus.OK);
	}

	public ResponseEntity<Void> customercreditdetailsPut(
			@ApiParam(value = "", required = true) @Valid @RequestBody UpdateCustomerCreditDetails updatecustomerCreditDetails) {

		customerCreditDetailService.updateCustomerCreditDetails(updatecustomerCreditDetails);

		return new ResponseEntity<>(HttpStatus.OK);
	}

}
