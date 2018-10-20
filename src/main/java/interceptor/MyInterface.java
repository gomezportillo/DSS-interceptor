package interceptor;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MyInterface {

	private final String _URL = "http://localhost:8080/interceptor/";

	public MyInterface()
	{
	}

	public void execute( double d )
	{
		System.out.println("Opening web browser on " + this._URL);

		if ( Desktop.isDesktopSupported() ) // Windows
		{
			try 
			{
				Desktop.getDesktop().browse( new URI( this._URL ) );
			} 
			catch (IOException e) 
			{
				System.out.println("IO exception opening browser on Windows/Mac");
			} 
			catch (URISyntaxException e)
			{
				System.out.println("URI syntax exception opening browser on Windows/Mac");
			}
		} 
		else // Ubuntu
		{
			Runtime runtime = Runtime.getRuntime(); 
			try 
			{
				runtime.exec("/usr/bin/firefox -new-window " + this._URL);
			} 
			catch (IOException e) 
			{
				System.out.println("IO exception opening browser on Linux");
			}
		}
	}
}
