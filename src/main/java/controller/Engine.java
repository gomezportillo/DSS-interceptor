package controller;

import aux.Variables;

public class Engine 
{
	private Variables.Engine_state state;

	public Engine()
	{
		this.state = Variables.Engine_state.OFF;
	}

	public void turn_on()
	{
		this.state = Variables.Engine_state.ON;
	}

	public void turn_off()
	{
		this.state = Variables.Engine_state.OFF;
	}

	public void accelerate()
	{
		if ( is_on() )
		{
			this.state = Variables.Engine_state.ACCELERATING;
		}
	}
	
	public boolean is_on()
	{
		return this.state == Variables.Engine_state.ON;
	}
	
	public boolean is_off()
	{
		return this.state == Variables.Engine_state.OFF;
	}
	
	public boolean is_accelerating()
	{
		return this.state == Variables.Engine_state.ACCELERATING;
	}
}
