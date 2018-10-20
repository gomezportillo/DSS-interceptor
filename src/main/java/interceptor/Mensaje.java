package prueba;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mensaje", eager = true)
@RequestScoped
public class Mensaje implements Serializable 
{
	private String mensaje = "Mensaje bean: hola mundo!";

	public String getMensaje()
	{
		return mensaje;
	}

	public void setMensaje (String m)
	{
		this.mensaje = m;
	}
}