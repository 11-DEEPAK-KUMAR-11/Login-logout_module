package com.loginLogout.model;

import lombok.Data;

@Data
public class LoginDTO {

	private String mobileNo;
	private String password;
	
	//here we can specify role of the user
	//private String role;
	
}
