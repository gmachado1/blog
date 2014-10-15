public class Estadio  {
	/**
	 * 
	 */
	private String nome;
	private int idade;
	
	public Estadio(){
		this.nome = "Mineirao";
		this.idade=49;
		
	}
	public Estadio(String nome, int idade){
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