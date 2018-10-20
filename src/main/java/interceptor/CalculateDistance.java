package interceptor;

public class CalculateDistance implements Filter 
{
	private final double _RADIUS = 1;
	private double _prevRevol = 0.0;
	
	public double execute(Object o) 
	{
		double revolutions = (Double) o;
		double distance = (revolutions - this._prevRevol) * 2 * this._RADIUS * Math.PI;
		_prevRevol = revolutions;
		
		return distance;
	}
}
