package interceptor;

public class FilterManager 
{
	private FilterChain _filterChain;

	public FilterManager( MyInterface t ) 
	{
		this._filterChain = new FilterChain();
		this._filterChain.setTarget( t );
	}

	public void setFilter( Filter f ) 
	{
		this._filterChain.addFilter( f );
	}

	public void filterRequest( double r )
	{
		this._filterChain.execute( r );
	}
}
