import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Busca {

	// argumentos "\d\w" "ab4 56_'7ab" "\d\d" "1b2c335f456"

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pattern p = Pattern.compile("aba"); // a expressao
		Matcher m = p.matcher("abababa"); // a fonte
		boolean b = false;
		while (b = m.find()) {
			System.out.print(">> " + m.start());
		}
		System.out.print("\n");

		// digito numeral
		try {
			Pattern n = Pattern.compile("\\D"); // a expressao
			Matcher numeros = n.matcher("a12c3e455f"); // a fontex
			boolean i = false;
			while (i = numeros.find()) {
				System.out.print(numeros.start() + " numero \n");
			}
			Pattern ca = Pattern.compile("[a-cA-C]"); // a expressao
			Matcher cafeBABE = ca.matcher("cafeBABE"); // a fonte
			while (cafeBABE.find()) {
				System.out.print(cafeBABE.start() + " cafe\n");
			}
			System.out.print("\n");

			Pattern p1 = Pattern.compile(args[0]);
			Matcher m1 = p1.matcher(args[1]);
			System.out.println("Pattern é " + m1.pattern());
			boolean b1 = false;

			while (b1 = m1.find()) {
				System.out.println(m1.start() + " " + m1.group());
			}
		} catch (Exception e) {
			System.out.println("exc - 0");
		}
		
		
		try {
			Pattern n = Pattern.compile("0[xX][0-9a-fA-F]"); // a expressao
			Matcher numeros = n.matcher("12 0x 0x12 0Xf 0xg"); // a fontex
			boolean i = false;
			while (i = numeros.find()) {
				System.out.print(numeros.start() + " <  teste3\n");
			}
		} catch (Exception e) {
			System.out.println("erro no 12 0x 0x12 OXf 0xcr");
		}
		
		try {
			Pattern n = Pattern.compile("\\d"); // a expressao
			Matcher numeros = n.matcher("1 a12 234b"); // a fontex
			boolean i = false;
			while (i = numeros.find()) {
				System.out.print(numeros.start() + " < um numero apenas\n");
			}
		} catch (Exception e) {
			System.out.println(" Erro: < um numero apenas\n");
		}
		
		
		try {
			Pattern n = Pattern.compile("\\d+"); // a expressao
			Matcher numeros = n.matcher("1 a12 234b"); // a fontex
			boolean i = false;
			while (i = numeros.find()) {
				System.out.print(numeros.start() + " < um numero ou mais\n");
			}
		} catch (Exception e) {
			System.out.println("Erro: < um numero ou mais\n");
		}
		
		
		try{
			Pattern n = Pattern.compile("proj1([^,])*");
			//simulando arquivos com ponto e vigula
			Matcher fonte = n.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
			while (fonte.find()) {
				System.out.print(fonte.start() + " < arquivos \n");
			}
		} catch (Exception e) {
			System.out.println("Erro: < um numero ou mais\n");
		}
		
		try{
			Pattern n = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d([^\\w])");
			//simulando arquivos  de telefone com vigula
			Matcher tel = n.matcher("1234567, 12x4567, 11123 4567, 123x4567, 123e4567, 123-4567, 12x45674, 123 45673, 123x45673, 123e45671");
			while (tel.find()) {
				System.out.print(tel.start() + "< telefone \n");
			}
		} catch (Exception e) {
			System.out.println("Erro: < um numero ou mais\n");
		}
		
		try{
			Pattern n = Pattern.compile("a.c");
			//simulando arquivos  de telefone com vigula
			Matcher abc = n.matcher("ac abc a c");
			while (abc.find()) {
				System.out.print(abc.start() + "< testando ponto a.c \n");
			}
		} catch (Exception e) {
			System.out.println("Erro: < um numero ou mais\n");
		}
		
		try{
			Pattern n = Pattern.compile(".*?xx"); // usamos o "." ponto pra dizer que usaremos um metacaracteres quantificador
			Matcher relutante = n.matcher("yyxxxyxx");
			while (relutante.find()) {
				System.out.print(relutante.start() + "< relutante \n");
			}
		} catch (Exception e) {
			System.out.println("Erro: < relutante, \n"+e);
		}
		
		try{
			Pattern n = Pattern.compile(".*xx");
			Matcher ganancioso = n.matcher("yyxxxyxxd");
			while (ganancioso.find()) {
				System.out.print(ganancioso.start() + "<  ganancioso \n");
			}
		} catch (Exception e) {
			System.out.println("Erro: < ganancioso \n"+e);
		}

		// scan
		System.out.println("input:");
		System.out.flush();
		try {
			Scanner s = new Scanner(System.in);
			String token;
			do {
				token = s.findInLine(args[0]);
				System.out.println("found " + token);
//1b2c335f456
			} while (token != null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
