package com.svj.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.common.base.Optional;
import com.svj.core.Auth;

@Path("/os")
@Produces(MediaType.APPLICATION_JSON)
public class OsAuthResource {
	
	private String uname;
	private String pwd ;
	
	public OsAuthResource(String uname, String pwd)
	{
		this.uname = uname ;
		this.pwd = pwd ;
		
	}
	
	@GET
	@Path("/auth")
	public Auth logIn()
	{
		Auth auth = new Auth() ;
		auth.setUserName(uname);
		auth.setPassword(pwd);
		auth.setToken("1212121");
		return auth ;
		
	}

}
