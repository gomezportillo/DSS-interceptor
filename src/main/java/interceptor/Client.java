package interceptor;

public class Client 
{
	private FilterManager _filterManager;
	
	public Client()
	{
	}
	
	public void setFilterManager( FilterManager fm ) 
	{
		this._filterManager = fm;
	}
	
	public void sendRequest( double r ) 
	{
		this._filterManager.filterRequest( r );
	}
}
