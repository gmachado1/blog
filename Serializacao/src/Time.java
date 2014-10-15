import java.io.Serializable;
import java.util.List;


public class Time implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String nome;
	private String estado;
	private Tecnico tecnico;
	transient private Estadio estadio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
}
