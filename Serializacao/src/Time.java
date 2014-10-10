import java.io.Serializable;
import java.util.List;


public class Time implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String estado;
	private Jogador tecnico;
	private List<Jogador> jogadores;
	
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
	public Jogador getTecnico() {
		return tecnico;
	}
	public void setTecnico(Jogador tecnico) {
		this.tecnico = tecnico;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	

}
