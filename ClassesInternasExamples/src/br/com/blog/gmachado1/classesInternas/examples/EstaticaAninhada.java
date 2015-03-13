package br.com.blog.gmachado1.classesInternas.examples;

public class EstaticaAninhada {
	static class InternaEstatica{
		public void manobra2(){
			System.out.println("cut-back");
		}
	}
	
	public static void main(String ...args){
		Normal.InternaEstatica1 n = new Normal.InternaEstatica1();
		n.manobra();
		
		InternaEstatica ea = new InternaEstatica();
		ea.manobra2();
	}

}
class Normal{
	static class InternaEstatica1{ 
		public void manobra(){
			System.out.println("HangFly");
		}
	}
}