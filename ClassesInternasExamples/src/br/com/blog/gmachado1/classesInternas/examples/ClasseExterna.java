package br.com.blog.gmachado1.classesInternas.examples;

public class ClasseExterna {
	private int x = 7;
	String textoDeIncentivo = "Vai Medina!! #BrazilianStorm";

	public static void main(String... args) {
		ClasseExterna ce = new ClasseExterna();
		System.out.println(ce.textoDeIncentivo);
		ce.getClasseInterna();
		ce.getClasseLocalInterna();
		ce.getClasseLocalInterna();

		// ou
		ClasseExterna.ClasseInterna ci = ce.new ClasseInterna();
		ci.getXExterno();
		ci.getTextoDeIncentivo();
		ci.getXInterno();
		ci.metodoClasseInterna();

		// ou
		ClasseExterna.ClasseInterna ceci = new ClasseExterna().new ClasseInterna();
		ceci.getXExterno();
		ceci.getTextoDeIncentivo();
		ceci.getXInterno();
		ceci.metodoClasseInterna();
	}

	public void getClasseInterna() {
		ClasseInterna ci = new ClasseInterna();
		ci.getXExterno();
		ci.getXInterno();
	}

	public void getClasseLocalInterna() {// abre método
		final int z = 10;
		class LocalInterna { // inicia classe
			public void getClasseLocalInterna() {// inicia metodo da classe
				System.out.println("Método de uma Classe Local Interna");
				System.out.println("Variável z" + z);
				System.out.println("Variável x" + x);
				System.out.println("Variável ClasseExterna.this.x"
						+ ClasseExterna.this.x);
			}// fecha metodo da classe
		}// fecha classe
		LocalInterna cecili = new LocalInterna();
		cecili.getClasseLocalInterna();
	}

	class ClasseInterna {
		private int x = 3;

		public void getTextoDeIncentivo() {
			System.out.println("textoDeIncentivo é "
					+ ClasseExterna.this.textoDeIncentivo);
			System.out.println("textoDeIncentivo é " + textoDeIncentivo);
		}

		public void getXExterno() {
			System.out.println("x é " + ClasseExterna.this.x);
		}

		public void getXInterno() {
			System.out.println("this.x é " + this.x);
			System.out.println("x é " + x);
		}

		public void metodoClasseInterna() {
			final int z = 10;
			class LocalInterna { // inicia classe
				public void getClasseLocalInterna() {// inicia metodo da classe
					System.out.println("Método de uma Classe Local Interna");
					System.out.println("Variável z" + z);
					System.out.println("Variável x" + x);
					System.out.println("Variável ClasseExterna.this.x"
							+ ClasseExterna.this.x);
				}// fecha metodo da classe
			}// fecha classe
			LocalInterna cecili = new LocalInterna();
			cecili.getClasseLocalInterna();
		}
	}// fecha classe interna
}