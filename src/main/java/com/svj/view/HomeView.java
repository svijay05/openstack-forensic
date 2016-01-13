package com.svj.view;


public class HomeView extends BaseView
{
    private String msg = "Welcome page";
    
    
    public HomeView(String title)
    {
        super("/views/home.mustache",title) ;       
          
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg( String msg )
    {
        this.msg = msg;
    }

    protected HomeView( String templateName, String title )
    {
        super( templateName, title );
    }

}
