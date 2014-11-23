import java.util.Scanner;

public class Tokenizacao {

	public static void main(String args[]) {
		System.out.println("tokenizacao");

		try {// argumentos: "ab5 ccc 45 @" "\d"
			String[] tokens = args[0].split(args[1]);
			System.out.println("count " + tokens.length);
			for (String s : tokens)
				System.out.println("D >>" + s + "<");
		} catch (Exception e) {
			System.out.println("erro token" + e.getMessage());
		}

		try {// argumentos: "ab5 ccc 45 @" "\s"
			String[] tokens = args[0].split(args[2]);
			System.out.println("count " + tokens.length);
			for (String s : tokens)
				System.out.println("S >>" + s + "<");
		} catch (Exception e) {
			System.out.println("erro token" + e.getMessage());
		}

		// argumentos: "1 true 34 hi"
		boolean b2, b;
		int i;
		String s, hits = " ";
		Scanner s1 = new Scanner(args[3]);
		Scanner s2 = new Scanner(args[3]);
		while (b = s1.hasNext()) {
			s = s1.next();
			hits += "s";
		}

		while (b = s2.hasNext()) {
			if (s2.hasNextInt()) {
				i = s2.nextInt();
				hits += "i";
			} else if (s2.hasNextBoolean()) {
				b2 = s2.nextBoolean();
				hits += "b";
			} else {
				s2.next();
				hits += "s2";
			}
		}
		System.out.println("hits" + hits);
		
		
		// argumentos: "1;true;34;hi"
		boolean b3, b4;
		int i7;
		String s5, hits2 = " ";
		Scanner s3 = new Scanner(args[4]).useDelimiter(";");
		Scanner s4 = new Scanner(args[4]).useDelimiter(";");
		while (b3 = s3.hasNext()) {
			s5 = s3.next();
			hits2 += "s";
		}

		while (b3 = s4.hasNext()) {
			if (s4.hasNextInt()) {
				i7 = s4.nextInt();
				hits2 += "i";
			} else if (s4.hasNextBoolean()) {
				b4 = s4.nextBoolean();
				hits2 += "b";
			} else {
				s4.next();
				hits2 += "s4";
			}
		}
		System.out.println("hits com ponto e virgula" + hits);

		

		int i1 = -123;
		int i2 = 12345;
		System.out.printf(">%1$ (7d< \n", i1);
		System.out.printf(">%0,7d< \n", i2);
		System.out.format(">%+-7d< \n", i2);
		System.out.printf(">%2$b + %1$5d< \n", i1, false);

	}

}
