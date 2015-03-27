package br.com.blog.gmachado1.genericos;

import java.util.ArrayList;
import java.util.HashSet;

import br.com.blog.gmachado1.model.Surfista;

public class TestandoListaSet {

	public static void main(String args[]){
		
		
		ArrayList<Surfista>surfistas = (ArrayList<Surfista>) Surfista.mockSurfistas();
		HashSet<Surfista> sets1 = new HashSet<Surfista>();
		System.out.println("Antes: ArrayList - "+surfistas.size());
		System.out.println("Antes: HashSet - "+sets1.size());
		sets1.addAll(surfistas);
		System.out.println("Durante: ArrayList - "+surfistas.size());
		System.out.println("Durante: HashSet - "+sets1.size());
		surfistas.add(new Surfista("Gabriel Medina", "Medina", 19, 1));
		sets1.add(new Surfista("Gabriel Medina", "Medina", 19, 1));
		System.out.println("Depois: ArrayList - "+surfistas.size());
		System.out.println("Depois: HashSet - "+sets1.size());
		
	}
}
