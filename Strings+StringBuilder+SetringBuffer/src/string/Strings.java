package string;

import java.util.logging.Logger;

public class Strings {

	static Logger log = Logger.getLogger(Strings.class.getName());

	public static void main(String[] args) {
		
		log.info("Iniciando parte sobre strings.");
		log.info("Declarando strings.");
		String s = new String();
		String s1 = new String(" string1");
		String s2 = "";
		String s3 = "string3";
		log.info("Copiando strings.");
		String s4 = s1;
		System.out.println(s4);
		System.out.println(s1);
		
	
		log.info("trabalhando com strings.");
		
		  s1.concat( " acrescrentando texto" );
          s2 = " mais texto" ;
         // s3 = + " acrescrentando texto" ; // erro de compilação
          
          System. out.println(s1);
          System. out.println(s2);
          System. out.println(s3);

		
		s1 = s1.concat(" acrescrentando texto");
		s2 +=" mais texto";
		s3 = s3+" acrescrentando texto";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
			
		
		//TODO comecar String
		
		log.info("Encerrando parte sobre strings.");
	}
}
	