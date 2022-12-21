package com.loginLogout.service;

import com.loginLogout.exceptions.LoginException;
import com.loginLogout.model.LoginDTO;

public interface LoginService {
	
	public String logIntoAccount(LoginDTO dto)throws LoginException;

	public String logOutFromAccount(String key)throws LoginException;

}
