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
		
		t= new Time();
		try{
			FileInputStream fis = new FileInputStream("exemplo.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			t = (Time) ois.readObject();//deserializando
			ois.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("nome do time"+t.getNome());
		System.out.println("estado do time"+t.getEstado());
	}
	
	public static Time populaTimeCruzeiro(Time t){
		t.setEstado("MG");
		t.setNome("Cruzeiro");
		return t;
	}
	public static Time populaTimeAtletico(Time t){
		t.setEstado("MG");
		t.setNome("Atletico");
		return t;
	}
}
