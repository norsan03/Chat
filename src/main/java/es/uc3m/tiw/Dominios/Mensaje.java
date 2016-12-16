package es.uc3m.tiw.Dominios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MENSAJES")
public class Mensaje implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(length = 25)
	private String IdEmisor;
	@Column(length = 25)
	private String IdReceptor;
	@Column(length = 25)
	private long IdProducto;
	@Column(nullable = false, length = 300)
	private String mensaje;
	

	public Mensaje() {
	}
	
	public Mensaje(long id, String mensaje, long producto, long IdProducto, String IdEmisor, String IdReceptor) {
		super();
		this.id = id;
		this.IdEmisor = IdEmisor;
		this.IdReceptor= IdReceptor;
		this.mensaje = mensaje;
		this.IdProducto = IdProducto;
	}
	
	public long getIdproducto() {
		return IdProducto;
	}
	public void setIdProducto(long IdProducto) {
		this.IdProducto = IdProducto;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdEmisor() {
		return IdEmisor;
	}
	public void setIdEmisor(String IdEmisor) {
		this.IdEmisor = IdEmisor;
	}
	public String getIdReceptor() {
		return IdReceptor;
	}
	public void setIdReceptor(String IdReceptor) {
		this.IdReceptor = IdReceptor;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
