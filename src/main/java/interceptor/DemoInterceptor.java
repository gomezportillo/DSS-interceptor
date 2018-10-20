package interceptor;

public class DemoInterceptor {

	public static void main( String[] args ) 
	{
		FilterManager _filterManager = new FilterManager( new MyInterface() );
		_filterManager.setFilter( new Calculate() );
		
		Client _client = new Client();
		_client.setFilterManager( _filterManager );
		
		_client.sendRequest( 500 );
		
	}

}
