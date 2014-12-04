package br.com.blog.gmachado1.import_example;

import static br.com.blog.gmachado1.test.AuxiarExample.TEST; //importa especificamente a classe
												//AuxiarExample com suas funcões

import br.com.blog.gmachado1.test.*; //importa tudo dentro do pacote test

public class ImportExample {

	public static void main(String args[]) {
		AuxiarExample teste = new AuxiarExample();
		System.out.println(teste.TEST);// 
		System.out.println(TEST);// possivel gracas ao import estatico
	}
}
