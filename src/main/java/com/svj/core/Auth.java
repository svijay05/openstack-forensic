package com.svj.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Auth {

	private String token ;
	private String userName;
	private String password ;

	@JsonProperty
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonProperty
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@JsonProperty
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
