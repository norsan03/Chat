package es.uc3m.tiw.Dominios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MENSAJES")
public class Mensaje {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private long IdEmisor;
	@Column
	private long IdReceptor;
	@Column
	private long IdProducto;
	@Column(nullable = false, length = 300)
	private String mensaje;
	

	public Mensaje() {
	}
	
	public Mensaje(long id, long origenId, long destinoId, String mensaje, long producto, long IdProducto, long IdEmisor, long IdReceptor) {
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
	public long getIdEmisor() {
		return IdEmisor;
	}
	public void setIdEmisor(long IdEmisor) {
		this.IdEmisor = IdEmisor;
	}
	public long getIdReceptor() {
		return IdReceptor;
	}
	public void setIdReceptor(long IdReceptor) {
		this.IdReceptor = IdReceptor;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
