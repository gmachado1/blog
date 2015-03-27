package br.com.blog.gmachado1.genericos;

import br.com.blog.gmachado1.model.Surfista;

public class TestandoEquals {

	public static void main(String args[]) {
		Surfista s1 = new Surfista("Gabriel Medina", "Medina", 19, 1);
		Surfista s7 = new Surfista("Gabriel Medina", "Medina", 19, 1);

		System.out.println(s1.equals(s7));
		System.out.println(s1.hashCode());
		System.out.println(s7.hashCode());
		if (s1.equals(s7)) {
			System.out.println("igual \n" + s1 + " = " + s7);
		} else {
			System.out.println("diferente");
		}

	}
}
/**
 * Surfista s2 = new Surfista("Miguel Pupo", "Dropador", 21,2); Surfista s3 =
 * new Surfista("Adriano Souza", "Rasgador", 26,3); Surfista s4 = new
 * Surfista("Raone Monteiro", "Monteiro", 30,4); Surfista s5 = new
 * Surfista("Alejo Muniz", "novato", 23,5); Surfista s6 = new
 * Surfista("Felipe Toledo", "cacula", 18,6);
 **/
