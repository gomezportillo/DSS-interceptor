package interceptor;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "webController", eager = true)
@SessionScoped
public class WebController implements Serializable
{

	private static final long serialVersionUID = -398064717122939161L;

	@ManagedProperty( value = "#{textState}" )
	private String textState;

	@ManagedProperty( value = "#{textOnOff}" )
	private String textOnOff;

	@ManagedProperty( value = "#{textAccelerate}" )
	private String textAccelerate;

	private boolean state = Variables.STATE_ENGINE_OFF;

	public WebController()
	{ 
		System.out.println("Creating web controller");
	}

	public void toggleOnOff( ActionEvent e )
	{
		if ( this.state == Variables.STATE_ENGINE_ON )
		{
			System.out.println("Turning off...");
			this.textState = Variables.TXT_ENGINE_OFF;
			this.textOnOff = Variables.TXT_TURN_ON;
		}
		else
		{
			System.out.println("Turning on...");
			this.textState = Variables.TXT_ENGINE_ON;
			this.textOnOff = Variables.TXT_TURN_OFF;
		}
		this.state = !this.state;
	}

	public void accelerate( ActionEvent e )
	{
		System.out.println("Accelerating...");
	}

	public String getTextState() 
	{
		if ( this.textState == null )
		{
			this.textState = Variables.TXT_ENGINE_OFF;
		}
		return this.textState;
	}

	public void setTextState( String s ) 
	{
		this.textState = s;
	}

	public String getTextOnOff()
	{
		if ( this.textOnOff == null)
		{
			this.textOnOff = Variables.TXT_TURN_ON;
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
			this.textAccelerate = Variables.TXT_ACCELERATE;
		}
		return this.textAccelerate;
	}

	public void setTextAccelerate( String t )
	{
		this.textAccelerate = t;
	}


}
