package br.com.blog.gmachado1.classesInternas.examples;

public class ds {

}

class ClassePai{
	public void metodoX(){
		System.out.println("X pai");
	}
	public void metodoY(){
		System.out.println("Y pai");
	}
	public void metodoZ(){
		System.out.println("Z pai");
	}
}

class ClasseFilho extends ClassePai {
	public void metodoY(){
		System.out.println("Y filho");
	}
	public void metodoW(){
		System.out.println("w filho");
	}
}
class Filho extends ClassePai {
	public static void main(String ...args){
		ClassePai p = new  ClasseFilho();
		p.metodoX();// Ok roda referencia pai imprime X pai
		p.metodoY();// Ok roda imprime Y filho (sobrescreve)
//		p.metodoW();// ERRO DE COMPILACAO
	}
}