import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Time extends Esporte implements Serializable {
	
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
	
	private void writeObject(ObjectOutputStream oos){ //sobrescrevendo o método
		//lanca Exception
		try{
			oos.defaultWriteObject();//serializando
			oos.writeInt(estadio.getIdade());//serializando idade
			oos.writeBytes(estadio.getNome());//serializando nome
		}catch(Exception e){
			System.out.println("setando idade.");
		}
	}
	
	private void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();//deserializando
			estadio = new Estadio();//instanciando
			estadio.setIdade(ois.readInt());//repare que é mesma ordem de serialização
			estadio.setNome(ois.readLine());//idade depois nome
		}catch(Exception e){
			System.out.println("pegando nome e idade.");
		}
		
	}
}
