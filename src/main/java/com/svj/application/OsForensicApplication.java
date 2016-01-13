package com.svj.application;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

import javax.ws.rs.client.Client;

import org.skife.jdbi.v2.DBI;

import com.svj.db.service.ToDo;
import com.svj.resource.OsAuthResource;
import com.svj.resource.ViewProcessor;

public class OsForensicApplication extends Application< OsConfiguration >
{

    @Override
    public void initialize( Bootstrap< OsConfiguration > bootstrap )
    {

        bootstrap.setConfigurationSourceProvider( new SubstitutingSourceProvider( bootstrap
                .getConfigurationSourceProvider(), new EnvironmentVariableSubstitutor() ) );
        bootstrap.addBundle(new ViewBundle());
        bootstrap.addBundle(new AssetsBundle());

    }

    @Override
    public void run( OsConfiguration configuration, Environment environment ) throws Exception
    {

        final DBIFactory factory = new DBIFactory();
        
        
   /*     
    *   DB Settings
    * final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");

        @SuppressWarnings("unused")
        final ToDo todoService = jdbi.onDemand(ToDo.class);
        
        System.out.println("Helloooooo>>>" + todoService.getToDos( "11" ).size());*/
        
        // Configuration for HTTP client requests.
        @SuppressWarnings("unused")
        final Client client = new JerseyClientBuilder(environment).using(configuration.getJerseyClientConfiguration()).build(
                getName());
        
        
        final OsAuthResource resource = new OsAuthResource( configuration.getUsername(), configuration.getPassword() );
        final ViewProcessor vp = new com.svj.resource.ViewProcessor() ;
        
        
        environment.jersey().register( resource );
        environment.jersey().register( vp );
    }

    public static void main( String[] args ) throws Exception
    {
        new OsForensicApplication().run( args );
    }

}
