package br.com.blog.gmachado1.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Surfista implements Comparable<Surfista>, Comparator<Surfista>{

	String nome;
	String apelido;
	int idade;
	int id;
//getters e  setters abaixo
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result + ((apelido == null) ? 0 : apelido.trim().length());
		result = result + idade;
		result = result + ((nome == null) ? 0 : nome.trim().length());
		result *= prime;
		return result;
	}

	public Surfista(String nome, String apelido, int idade, int id) {
		setId(id);
		setApelido(apelido);
		setIdade(idade);
		setNome(nome);
	}

	public Surfista() {
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Surfista && (((Surfista) obj).getId() == this.id)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Surfista [nome=" + nome + " , apelido=" + apelido+ ", idade=" + idade + "]";
	}

	public static List<Surfista> mockSurfistas() {
		List<Surfista> toReturn = new ArrayList<Surfista>();
		toReturn.add(new Surfista("Gabriel Medina", "Medina", 19, 1));
		toReturn.add(new Surfista("Miguel Pupo", "Dropador", 21, 2));
		toReturn.add(new Surfista("Adriano Souza", "Rasgador", 26, 3));
		toReturn.add(new Surfista("Raone Monteiro", "Monteiro", 30, 4));
		toReturn.add(new Surfista("Alejo Muniz", "novato", 23, 5));
		toReturn.add(new Surfista("Felipe Toledo", "cacula", 18, 6));
		return toReturn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override //para o compilador saber que esta sobrecarregando Boas práticas
	public int compareTo(Surfista o) {
		return nome.compareTo(o.getNome());
	}

	@Override
	public int compare(Surfista o1, Surfista o2) {
		return o1.getApelido().compareTo(o2.getApelido());
	}
}
