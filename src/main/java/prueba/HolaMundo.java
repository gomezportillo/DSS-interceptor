package prueba;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "holaMundo", eager = true)
@RequestScoped
public class HolaMundo 
{
	private String mensaje;
	
	@ManagedProperty(value="#{mensaje}")
	private Mensaje mensajeBean;

	public HolaMundo()
	{
		System.out.println("Hola mundo ha empezado");
	}

	public String getMensaje()
	{		
		if (this.mensajeBean != null)	
		{	
			this.mensaje = this.mensajeBean.getMensaje();
		}
		return mensaje;
	}

	public void setMensajeBean (Mensaje m) {
		this.mensajeBean = m;
	}
}