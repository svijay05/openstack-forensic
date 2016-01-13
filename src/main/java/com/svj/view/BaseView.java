package com.svj.view;
import io.dropwizard.views.View;

public class BaseView  extends View
{
   

    private String title ;
    private String version ="unknown" ;
    
    protected BaseView( String templateName , String title)
    {
        super( templateName );
        this.title = title ;
    
    }
    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion( String version )
    {
        this.version = version;
    }

}
