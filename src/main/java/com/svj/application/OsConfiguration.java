package com.svj.application;

import io.dropwizard.Configuration;
import io.dropwizard.client.JerseyClientConfiguration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OsConfiguration extends Configuration
{

    @Valid
    @NotEmpty
    private String osUrl;

    @Valid
    @NotEmpty
    private String username;

    @Valid
    @NotEmpty
    private String password;

    @JsonProperty
    public String getUsername()
    {
        return username;
    }

    @JsonProperty
    public String getPassword()
    {
        return password;
    }

    @JsonProperty
    public String getOsUrl()
    {
        return osUrl;
    }

    @Valid
    @NotNull
    @JsonProperty
    private JerseyClientConfiguration httpClient = new JerseyClientConfiguration();

    public JerseyClientConfiguration getJerseyClientConfiguration()
    {
        return httpClient;
    }

    @Valid
    @NotNull
    private DataSourceFactory database = new DataSourceFactory();

    @JsonProperty( "database" )
    public DataSourceFactory getDataSourceFactory()
    {
        return database;
    }
    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory dataSourceFactory)
    {
        this.database = dataSourceFactory;
    }

}
