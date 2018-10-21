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

	@ManagedProperty( value = "#{btnAccelerateDisabled}" )
	private boolean btnAccelerateDisabled;
	
	private Engine engine;
	
	public EngineController()
	{ 
		System.out.println("Creating engine controller");

		this.engine = new Engine();
		this.btnAccelerateDisabled = true;
	}

	public void toggleOnOff( ActionEvent e )
	{
		if ( this.engine.is_on() || this.engine.is_accelerating() )
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
		this.engine.turn_off();
		this.textState = Variables.TXT_ENGINE_OFF;
		this.textOnOff = Variables.TXT_TURN_ON;
		this.btnAccelerateDisabled = Variables.TXT_BTN_ACCELERATE_DISABLED;
	}

	private void turn_on_engine()
	{
		System.out.println("Turning on...");
		this.engine.turn_on();
		this.textState = Variables.TXT_ENGINE_ON;
		this.textOnOff = Variables.TXT_TURN_OFF;
		this.btnAccelerateDisabled = Variables.TXT_BTN_ACCELERATE_ENABLED;
	}

	private void accelerate_engine()
	{
		if ( this.engine.is_on() )
		{
			System.out.println("Accelerating...");
			this.engine.accelerate();
			this.textState = Variables.TXT_ENGINE_ACCELERATING;
		}
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
	
	public boolean getBtnAccelerateDisabled()
	{
		return !this.btnAccelerateDisabled;	
	}

	public void setBtnAccelerateDisabled( boolean b )
	{
		this.btnAccelerateDisabled = b;
	}
}