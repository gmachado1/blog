package br.com.blog.gmachado1.classesInternas.examples;

public class ClasseInternaAnonima {

	public static void main(String... args) {
		InterfaceInternaAnonima iia = new InterfaceInternaAnonima() {
			public void teste() {
				System.out.println("Exemplo de classe interna anonima");
			}
		};
		iia.teste();
		ClasseInternaAnonima cia = new ClasseInternaAnonima();
		Aux b = new Aux();
		b.exemplo(new InterfaceInternaAnonima() {
			public void teste() {
				System.out.println("Exemplo de classe interna anonima");
			}
		});
	}
	ClasseAbstrata ds = new ClasseAbstrata(){public void te(){
	System.out.println("ds");	
	}
	};
}

class Aux {
	void exemplo(InterfaceInternaAnonima f) {
		System.out.println("exemplo");
		f.teste();
	}
}
abstract class ClasseAbstrata{
	public void te(){}
}