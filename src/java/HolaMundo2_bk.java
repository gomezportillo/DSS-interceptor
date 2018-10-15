//package holamundoMIC;
//
//import java.io.Serializable;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.RequestScoped;
//
//@ManagedBean(name = "holaMundo2", eager = true)
//@RequestScoped
//
//public class HolaMundo2 implements Serializable 
//{
//	@ManagedProperty(value = "#{mensaje}")
//	
//	private MensajeBean mensajeBean;
//	private String mensaje = "Nada aún";
//		
//	public HolaMundo2() 
//	{
//		System.out.println("HolaMundo2_ha_comenzado!");
//		System.out.println(this.mensaje);
//	}
//	
//	public String getMensaje()
//	{
//		if (this.mensajeBean != null)
//		{
//			this.mensaje = this.mensajeBean.getMensaje(); 
//		}
//		return this.mensaje;
//	}
//	
//	pubic void setBeanMensajeBean (MensajeBean m)
//	{
//		this.mensajeBean = m;
//	}
//}
//
//package holamundoMIC;
//
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.RequestScoped;
//
//@ManagedBean(name = "holaMundo", eager = true)
//@RequestScoped
//
//public class HolaMundo 
//{
//	@ManagedProperty(value = "#{mensaje}")
//
//	private MensajeBean mensaje;
//
//	public HolaMundo() 
//	{
//		System.out.println("HolaMundo_ha_comenzado!");
//	}
//
//	public String getMensaje()
//	{
//		return this.mensaje.getMensajes();
//	}
//
//	public void setBeanMensaje (MensajeBean m)
//	{
//		this.mensaje = m;
//	}
//}
//
//package holamundoMIC;
//
//import java.io.Serializable;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.RequestScoped;
//
//@ManagedBean(name="mensaje", eager=true)
//@RequestScoped
//
//public class MensajeBean implements Serializable
//{
//	private String mensaje = "Mensaje bean";
//
//	public String getMensaje()
//	{
//		return this.mensaje;
//	}
//
//	public void setMensaje (String m)
//	{
//		this.mensaje = m;
//	}
//}
//
//
