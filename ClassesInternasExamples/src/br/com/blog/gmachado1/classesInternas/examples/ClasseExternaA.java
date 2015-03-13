package br.com.blog.gmachado1.classesInternas.examples;




public class ClasseExternaA {
	

	public static void main(String args[]){
		
		ClasseExterna ce = new ClasseExterna();
		ce.getClasseInterna();//possui uma linha ClasseInterna ci = new ClasseInterna();
		// ou
		ClasseExterna.ClasseInterna ci = ce.new ClasseInterna();
		ci.getXExterno();
		// ou
		ClasseExterna.ClasseInterna ceci = new ClasseExterna().new ClasseInterna();
		ceci.getXExterno();
	}

}
