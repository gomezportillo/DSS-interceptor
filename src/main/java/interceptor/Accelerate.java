package interceptor;

public class Accelerate 
{
	public double execute( Object o ) 
	{
		double speed = (Double) o;
		System.out.println("Accelerating " + speed);
		
		return 0;
	}
}
