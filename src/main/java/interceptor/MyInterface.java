package interceptor;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MyInterface {

	private String _URL;

	public MyInterface()
	{
		this._URL = "http://localhost:8080/interceptor/faces/home.xhtml";
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
			catch (IOException | URISyntaxException e) 
			{
				System.out.println("Exception opening browser on Windows/Mac");
				System.out.println( e.getStackTrace() );
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
				System.out.println("Exception opening browser on Linux");
				System.out.println( e.getStackTrace() );
			}
		}
	}
}
