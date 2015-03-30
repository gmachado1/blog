package br.com.blog.gmachado1.genericos;

import java.util.List;

public class TestGeneric<T> {

	T umaInstancia;
	T[] arrayParametrizado;
	List<T> listaParametrizada;

	public TestGeneric(T umaInstancia, T[] arrayParametrizado,
			List<T> listaParametrizada) {
		this.umaInstancia = umaInstancia;
		this.arrayParametrizado = arrayParametrizado;
		this.listaParametrizada = listaParametrizada;
	}

	public T getUmaInstancia() {
		return umaInstancia;
	}

	public void setUmaInstancia(T umaInstancia) {
		this.umaInstancia = umaInstancia;
	}

	public T[] getArrayParametrizado() {
		return arrayParametrizado;
	}

	public void setArrayParametrizado(T[] arrayParametrizado) {
		this.arrayParametrizado = arrayParametrizado;
	}

	public List<T> getListaParametrizada() {
		return listaParametrizada;
	}

	public void setListaParametrizada(List<T> listaParametrizada) {
		this.listaParametrizada = listaParametrizada;
	}

}

class TestTresGeneric<T,X,Z extends Campeonatos> {

	T umaInstancia;
	X outraInstancia;
	Z tipoDeCampeonato;

	public TestTresGeneric(T umaInstancia, X outraInstancia,
			Z tipoDeCampeonato) {
		this.umaInstancia = umaInstancia;
		this.outraInstancia = outraInstancia;
		this.tipoDeCampeonato = tipoDeCampeonato;
	}

	public T getUmaInstancia() {
		return umaInstancia;
	}

	public void setUmaInstancia(T umaInstancia) {
		this.umaInstancia = umaInstancia;
	}

}