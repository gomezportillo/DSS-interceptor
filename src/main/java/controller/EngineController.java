package controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import aux.Variables;

@ManagedBean(name = "engineController", eager = true)
@SessionScoped
public class EngineController implements Serializable
{

	private static final long serialVersionUID = -398064717122939161L;

	@ManagedProperty( value = "#{textState}" )
	private String textState;

	@ManagedProperty( value = "#{textOnOff}" )
	private String textOnOff;

	@ManagedProperty( value = "#{textAccelerate}" )
	private String textAccelerate;

	private Variables.Engine_state state;

	public EngineController()
	{ 
		System.out.println("Creating web controller");
		
		this.state = Variables.Engine_state.OFF;
	}

	public void toggleOnOff( ActionEvent e )
	{
		if ( this.state == Variables.Engine_state.ON )
		{
			turn_off_engine();
		}
		else
		{
			turn_on_engine();
		}
	}

	public void accelerate( ActionEvent e )
	{
		accelerate_engine();
	}
	
	private void turn_off_engine()
	{
		System.out.println("Turning off...");
		this.state = Variables.Engine_state.OFF;
		this.textState = Variables.TXT_ENGINE_OFF;
		this.textOnOff = Variables.TXT_TURN_ON;
	}
	
	private void turn_on_engine()
	{
		System.out.println("Turning on...");
		this.state = Variables.Engine_state.ON;
		this.textState = Variables.TXT_ENGINE_ON;
		this.textOnOff = Variables.TXT_TURN_OFF;
	}
	
	private void accelerate_engine()
	{
		System.out.println("Accelerating...");
		this.state = Variables.Engine_state.ACCELERATING;
		this.textState = Variables.TXT_ENGINE_ACCELERATING;
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