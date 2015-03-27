package br.com.blog.gmachado1.genericos;

import br.com.blog.gmachado1.model.Surfista;

public class MetodoToString {

	public static void main(String args[]){
		Surfista s = new Surfista("Miguel Pupo", "Dropador", 21,2);
		System.out.println(s.toString());
		
	}
}
