package br.com.blog.gmachado1.genericos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import br.com.blog.gmachado1.model.Surfista;

public class TestandoSets {

	public static void main(String args[]) {
		boolean[] ba = new boolean[5];// boolean array de 5 elementos
		Set<Surfista> s = new HashSet<Surfista>();
		ba[0] = s.add(Surfista.mockSurfistas().get(0));
		ba[1] = s.add(Surfista.mockSurfistas().get(1));
		ba[2] = s.add(Surfista.mockSurfistas().get(0));//repetindo
		ba[3] = s.add(Surfista.mockSurfistas().get(3));
		ba[4] = s.add(Surfista.mockSurfistas().get(4));
		
		for(int i=0;i<ba.length;i++){
			System.out.println(ba[i]);
		}
		for(Object o:s){
			System.out.println(o);
		}
		System.out.println("############# TREE SET");
		
		Set<Surfista> t = new TreeSet<Surfista>();
		ba[0] = t.add(Surfista.mockSurfistas().get(0));//ds
		ba[1] = t.add(Surfista.mockSurfistas().get(1));
		ba[2] = t.add(Surfista.mockSurfistas().get(0));//repetindo
		ba[3] = t.add(Surfista.mockSurfistas().get(3));
		ba[4] = t.add(Surfista.mockSurfistas().get(4));
		
		for(int i=0;i<ba.length;i++){
			System.out.println(ba[i]);
		}
		for(Object o:t){
			System.out.println(o);
		}
	}
}
