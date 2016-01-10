package com.svj.application;

import com.svj.resource.OsAuthResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class OsForensicApplication extends Application<OsConfiguration> {

	@Override
	public void initialize(Bootstrap<OsConfiguration> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(OsConfiguration configuration, Environment environment) throws Exception {

		  final OsAuthResource resource = new OsAuthResource(
			        configuration.getUsername(),
			        configuration.getPassword()
			    );
			    environment.jersey().register(resource);
	}

	public static void main(String[] args) throws Exception {
		new OsForensicApplication().run(args);
	}

}
