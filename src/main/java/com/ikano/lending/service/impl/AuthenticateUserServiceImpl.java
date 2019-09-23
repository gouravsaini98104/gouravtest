package com.ikano.lending.service.impl;

import org.springframework.stereotype.Service;

import com.ikano.lending.model.Authenticate;
import com.ikano.lending.model.AuthenticateSuccess;
import com.ikano.lending.service.AuthenticateUserService;

@Service
public class AuthenticateUserServiceImpl implements AuthenticateUserService {

	public AuthenticateSuccess authenticateUser(Authenticate authenticate) {

		AuthenticateSuccess authenticateSuccess = new AuthenticateSuccess();
		authenticateSuccess.setStatus("Success");

		return authenticateSuccess;
	}

}
