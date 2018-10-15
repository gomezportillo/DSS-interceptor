package practica1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="holaMundo", eager=true)
@RequestScoped

public class HolaMundo 
{
	@ManagedProperty(value="#{mensaje}")

	private MensajeBean mensajeBean;
	private String mensaje;

	public HolaMundo()
	{
		System.out.println("Hola mundo ha empezado!");   
	}

	public String getMensaje()
	{   
		if(this.mensajeBean != null)
		{
			this.mensaje = this.mensajeBean.getMensaje();
		}       
		return this.mensaje;
	}

	public void setMensajeBean(MensajeBean m) 
	{
		this.mensajeBean = m;
	}
}