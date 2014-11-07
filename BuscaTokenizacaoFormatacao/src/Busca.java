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
			Pattern n = Pattern.compile("\\d+"); // a expressao
			Matcher numeros = n.matcher("1 a12 234b"); // a fontex
			boolean i = false;
			while (i = numeros.find()) {
				System.out.print(numeros.start() + " < um numero ou mais\n");
			}
		} catch (Exception e) {
			System.out.println("erro no 12 0x 0x12 OXf 0xcr");
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
			} while (token != null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
