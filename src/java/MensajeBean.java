package practica1;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mensaje", eager=true)
@RequestScoped

public class MensajeBean implements Serializable
{
   private String mensaje="Mensaje bean: hola!";
	
   public String getMensaje() 
   {
      return this.mensaje;
   }
   	
   public void setMensaje(String m) 
   {
      this.mensaje = m;
   }
}