package interceptor;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "webController", eager = true)
@RequestScoped
public class WebController implements Serializable
{
	private static final long serialVersionUID = 1L;

	public WebController()
	{
	}
	
    @ManagedProperty( value = "#{state}" )
    private String state;

	public String getState() 
	{
		if ( this.state == null )
		{
			this.state = "APAGADO";
		}
		return this.state;
	}

	public void setState( String s ) 
	{
		
		this.state = s;
	}
    
    
	
}
