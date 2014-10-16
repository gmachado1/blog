import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Serializacao {
	
	public static void main(String args[]){
		Time t = populaTimeCruzeiro(new Time());
		try{
			FileOutputStream fos = new FileOutputStream("exemplo.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t);//serializando
			oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			System.out.println("esporte: "+t.getNomeEsporte());
			System.out.println("nome do time: "+t.getNome());
			System.out.println("estado do time: "+t.getEstado());
			System.out.println("tecnico : "+t.getTecnico().getNome());
			System.out.println("tec.idade: "+t.getTecnico().getIdade());
			System.out.println("estadio : "+t.getEstadio().getNome());
			System.out.println("estadio.idade: "+t.getEstadio().getIdade());
		}catch(NullPointerException  e){
			System.out.println(e+"esperado que entre aqui!");
		}
		System.out.println("################################################");
		try{
			FileInputStream fis = new FileInputStream("exemplo.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			t = (Time) ois.readObject();//deserializando
			ois.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			System.out.println("esporte: "+t.getNomeEsporte());
			System.out.println("nome do time: "+t.getNome());
			System.out.println("estado do time: "+t.getEstado());
			System.out.println("tecnico : "+t.getTecnico().getNome());
			System.out.println("tec.idade: "+t.getTecnico().getIdade());
			System.out.println("estadio : "+t.getEstadio().getNome());
			System.out.println("estadio.idade: "+t.getEstadio().getIdade());
		}catch(NullPointerException  e){
			System.out.println(e+"esperado que entre aqui!");
		}		
	}
	
	public static Time populaTimeCruzeiro(Time t){
		t.setNomeEsporte("Futebol");
		t.setEstado("MG");
		t.setNome("Cruzeiro");
		Estadio e = new Estadio("toca2(Padrão FIFA) ",1);
		Tecnico te = new Tecnico();
		t.setEstadio(e);
		t.setTecnico(te);
		return t;
	}

}
