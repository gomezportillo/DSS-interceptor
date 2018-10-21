package interceptor;

import javax.faces.event.ActionEvent;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "webController", eager = true)
@SessionScoped
public class WebController implements Serializable
{
	private static final long serialVersionUID = 1L;

    @ManagedProperty( value = "#{state}" )
    private String state;
    
    @ManagedProperty( value = "#{textOnOff}" )
    private String textOnOff;
    
    @ManagedProperty( value = "#{textAccelerate}" )
    private String textAccelerate;
    
	public WebController()
	{
	}

    public void toggleOnOff( ActionEvent e )
    {
    	System.out.println("Turning on/off...");
    }
	
    public void accelerate( ActionEvent e )
    {
    	System.out.println("Accelerating...");
    }
	
	public String getState() 
	{
		if ( this.state == null )
		{
			this.state = "ENGINE OFF";
		}
		return this.state;
	}

	public void setState( String s ) 
	{
		
		this.state = s;
	}
    
	public String getTextOnOff()
	{
		if ( this.textOnOff == null)
		{
			this.textOnOff = "TURN ON";
		}
		return this.textOnOff;
	}
	
	public void setTextOnOff( String t )
	{
		this.textOnOff = t;
	}
	
	public String getTextAccelerate()
	{
		if ( this.textAccelerate == null)
		{
			this.textAccelerate = "ACCELERATE";
		}
		return this.textAccelerate;
	}
	
	public void setTextAccelerate( String a )
	{
		this.textAccelerate = a;
	}
    
	
}
