package com.ikano.lending.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.ikano.lending.api.AuthenticateApi;
import com.ikano.lending.model.Authenticate;
import com.ikano.lending.model.AuthenticateSuccess;
import com.ikano.lending.service.AuthenticateUserService;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-12T08:01:00.768Z")

@Controller
public class AuthenticateApiController implements AuthenticateApi {

	@Autowired
	private AuthenticateUserService authenticateUserService;

	public ResponseEntity<AuthenticateSuccess> authenticateUser(
			@ApiParam(value = "Autenticate User", required = true) @Valid @RequestBody Authenticate authenticate) {

		AuthenticateSuccess authenticateSuccess = authenticateUserService.authenticateUser(authenticate);

		return new ResponseEntity<>(authenticateSuccess, HttpStatus.OK);
	}

}
