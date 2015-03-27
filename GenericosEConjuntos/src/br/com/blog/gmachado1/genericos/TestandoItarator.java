package br.com.blog.gmachado1.genericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.blog.gmachado1.model.Surfista;

public class TestandoItarator {

	public static void main(String args[]){
		List<Surfista> s=new ArrayList<Surfista>();
		s=Surfista.mockSurfistas();
		Iterator<Surfista> i = s.iterator();//utilizacao de genericos
		while(i.hasNext()){
			Surfista s1= i.next();
			System.out.println(s1);
		}
		System.out.println("tamanho : "+s.size());
		System.out.println("get1 : "+s.get(1));
		System.out.println("Medina : "+s.indexOf(new Surfista("Gabriel Medina","Medina",19,1)));
		s.remove(0);
		Object[] oa =s.toArray();
		System.out.println("removeu?");
		for(Object o :oa){
			Surfista s1 = (Surfista)o;
			System.out.println(s1.getNome());
		}
	}
}
