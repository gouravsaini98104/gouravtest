package com.ikano.lending.service;

import com.ikano.lending.model.Authenticate;
import com.ikano.lending.model.AuthenticateSuccess;

public interface AuthenticateUserService {

	public AuthenticateSuccess authenticateUser(Authenticate authenticate);

}
