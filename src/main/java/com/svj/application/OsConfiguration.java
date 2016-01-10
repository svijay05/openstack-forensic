package com.svj.application;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OsConfiguration extends Configuration{

	
	   	@NotEmpty
	    private String osURL;
	   	@NotEmpty
	   	private String username ;
		@NotEmpty
	   	private String password ;
	   	
	    @JsonProperty
	   	public String getUsername() {
			return username;
		}
	    @JsonProperty
		public void setUsername(String username) {
			this.username = username;
		}
	    @JsonProperty
		public String getPassword() {
			return password;
		}
	    @JsonProperty
		public void setPassword(String password) {
			this.password = password;
		}


	    @JsonProperty
		public String getOsURL() {
			return osURL;
		}

	    @JsonProperty
		public void setOsURL(String osURL) {
			this.osURL = osURL;
		}


	
	
}
