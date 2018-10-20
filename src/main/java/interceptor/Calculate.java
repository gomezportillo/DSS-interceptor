package interceptor;

public class Calculate implements Filter 
{	
	private final double _INTERVAL = 1;
	
	public double execute(Object o) 
	{
		double distance = (Double) o;
		double speed = distance * 3600 / _INTERVAL;
		
		return speed;
	}
}
