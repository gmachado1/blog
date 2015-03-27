package br.com.blog.gmachado1.genericos;

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
	@Override
	public void metodoY(){
		System.out.println("Y filho");
	}
	public void metodoW(){
		System.out.println("w filho");
	}
}
public class TestandoSobrescricao{
	public static void main(String ...args){
		ClassePai p = new  ClasseFilho();
		System.out.println(p.toString());
		p.metodoX();// Ok roda referencia pai imprime “X pai”
		p.metodoY();// Ok roda imprime “ Y filho” (sobrescreve)
	//	p.metodoW();// ERRO DE COMPILACAO
		ClasseFilho f = new  ClasseFilho();
		f.metodoX();// Ok roda referencia pai imprime “X pai”
		f.metodoY();// Ok roda imprime “ Y filho” (sobrescreve)
		f.metodoW();// ok
	}
}