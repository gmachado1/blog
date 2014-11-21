import java.util.Scanner;


public class Tokenizacao {
	
	public static void main(String args[]){
		System.out.println("tokenizacao");
		
		try{// argumentos: "ab5 ccc 45 @" "\d"
			String[] tokens = args[0].split(args[1]);
			System.out.println( "count " + tokens.length) ;
			for(String s : tokens)
			System.out.println(">>"+ s + "<");
		}catch(Exception e){
			System.out.println("erro token"+e.getMessage());
		}
		
		//"1 true 34 hi"
		boolean b2, b;
		int i;
		String s, hits = " ";
		Scanner s1 = new Scanner(args[0]);
		Scanner s2 = new Scanner(args[0]);
		while(b = s1.hasNext()) {
			s = s1.next();
			hits += "s";
		}
		
		while(b = s2.hasNext()) {
		if (s2.hasNextInt()) {
			i = s2.nextInt(); hits+="i";
		} else if (s2.hasNextBoolean()) {
			b2 = s2.nextBoolean(); hits += "b";
		} else {
			s2.next(); hits +="s2" ;
		}
		}
		System.out.println("hits"+hits);
		
		
		int i1 = -123;
		int i2 = 12345;
		System.out.printf (">%1$ (7d< \n" , i1) ;
		System.out.printf (">%0,7d< \n", i2);
		System.out. format ( ">%+-7d< \n", i2) ;
		System.out.printf(">%2$b + %1$5d< \n", i1, false);
		
	}

}

