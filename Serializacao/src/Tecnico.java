import java.io.Serializable;


public class Tecnico implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String nome;
	private int idade;
	
	public Tecnico(){
		this.nome = "Marcelo Oliveira";
		this.idade=59;
		
	}
	public Tecnico(String nome, int idade){
		this.nome = nome;
		this.idade=idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}



}
