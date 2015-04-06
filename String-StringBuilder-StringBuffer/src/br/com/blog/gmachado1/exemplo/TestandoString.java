package br.com.blog.gmachado1.exemplo;

public class TestandoString {

	public static void main(String args[]){
		System.out.println("testando Strings!");
		
		String var = new String();
		String var1 = new String("Let's Surf");
		String var2 = " In Rio";
		System.out.println(var2);
		var2 = var1+var2;
		System.out.println(var2);
		var2.concat(" Baby!");
		System.out.println(var2);
		var2 = var2.concat("!");
		System.out.println(var2.toUpperCase());
		var2.toUpperCase();
		System.out.println(var2);
		// 
		String var3 = "um";
		String var4 = var3;// referenciando a um mesmo objeto
		
		String var5 = "LET'S SURF IN RIO";//já existe no heap
		String var6 = "Let's surf in Rio Baby!";//já existe no heap
		String var7 = "Let's surf in Rio";//já existe no heap
		String var8 = "Let's surf in Rio";//já existe no heap
		String var9 = new String("Let's surf in Rio");// a chamada de new forca a criacao de um novo objeto
		String var10 = var9.toLowerCase(); // a chamada por meio de um método, faz com que chame a palavra reservada new
		var2.concat(var1);
		var1 += " in Recreio!";
		System.out.println(var2+" "+var1);
		
		String aux = "0123456789";
		aux += aux.concat(aux);
		System.out.println("aux = "+aux);
		
		aux = "test My String";
		System.out.println(aux.toUpperCase());
		System.out.println(aux.toLowerCase());
		System.out.println(aux.toLowerCase().equalsIgnoreCase(aux.toUpperCase()));
		System.out.println("01234".length());
		System.out.println(aux.replace("t","X"));
		aux = " test My String ";
		System.out.println("*"+aux+"*");
		System.out.println("*"+aux.trim()+"*");
	}
}
