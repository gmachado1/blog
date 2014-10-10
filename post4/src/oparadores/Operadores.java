package oparadores;

import javax.swing.JButton;

public class Operadores {
	enum Color {
		RED, BLUE
	};

	public static void main(String args[]) {

		String animal = "unknown";
		int weight = 700;
		char sex = 'm';
		double colorWaveLenght = 1.630;

		if (weight >= 500)
			animal = "elefante";
		if (colorWaveLenght <= 'f')
			animal = "cinza " + animal;
		if (sex <= 'f')
			animal = "fêmea " + animal;

		System.out.println("O animal é " + animal);
		System.out.println("carachtere 'a' == 'a' ? " + ('a' == 'a'));
		System.out.println("carachtere 'a' == 'b' ? " + ('a' == 'b'));
		System.out.println("carachtere 'a' == 'A' ? " + ('a' == 'A'));
		System.out.println("carachtere 5 != 6 ? " + (5 != 6));
		System.out.println("carachtere 5.0 == 5L ? " + (5.0 == 5L));
		System.out.println("carachtere true == false ? " + (true == false));
		System.out.println("\n\n\n\n");
		JButton a = new JButton("TESTE");
		JButton b = new JButton("TESTE");
		JButton c = a;
		System.out.println("referencia a == b? " + (a == b));
		System.out.println("equals referencia a.equals(b)? "+a.equals(b));
		System.out.println("getText referencia a == b? "+a.getText() == b.getText());
		System.out.println("equals referencia a.equals(c)? "+a.equals(c));
		System.out.println("referencia a == c? " + (a == c));
		System.out.println("\n\n\n\n");

		Color c1 = Color.RED;
		Color c2 = Color.RED;

		if (c1 == c2) {
			System.out.println("==");
		}
		;
		if (c1.equals(c2)) {
			System.out.println("dot equals");
		}
		;

		String s = new String("teste");
		if (s instanceof String) {
			System.out.println("é uma instacia de String");
		}
		System.out.println("\n\n\n\n");
		// testando instanceof com heranca
		A ab = new B();
		m2(ab);

		B b4 = new B();
		m2(ab);

		C c4 = new C();
		/*
		 * if(c instanceof B){ // ex incompilavel ((B)c).facaAcoesDeB(); }else{
		 * System.out.println(" c nao possui referencia a B"); }
		 */

		String s2 = null;
		boolean b2 = null instanceof String;
		boolean c3 = s2 instanceof String;
		System.out.println(b2 + "<<<< b2 --- c3>>>>" + c3);

		int players = 0;
		System.out.println("Player online " + players++);
		System.out.println("Player  " + players);
		System.out.println("Player online now " + ++players);
		System.out.println("\n\n\n\n");
		int x = 2;
		int y = 3;
		if ((y == x++) | (x < ++y)) {
			System.out.println("x = " + x + "  y>>" + y);
		}

		// ternário
		int numOfAminais = 3;
		String s3 = (numOfAminais > 4) ? "limite nao alcancado" : "casa lotada";
		System.out.println("status de animais na casa é: " + s3);

		if ((isItSmall(3)) || (isItSmall(7))) {
			System.out.println("Result is true");
		}
		if ((isItSmall(6)) || (isItSmall(9))) {
			System.out.println("Result is true");
		}

		// testando diferenca
		int z = 5;
		if (++z > 5 || ++z > 6) {
			System.out.println("tensado dentro do if|| z > " + z);
			z++;
		}
		System.out.println("tensado || > " + z);
		System.out.println("\n\n\n\n");
		int z2 = 5;
		if (++z2 > 5 | ++z2 > 6) {
			System.out.println("tensado || dentro do if z2 > " + z);
			z2++;
		}
		System.out.println("tensado || > " + z2);

		System.out.println("xor (2<3)^(4>2)" + ((2 < 3) ^ (4 > 2)));
		System.out.println("xor (4<3)^(4>2)" + ((4 < 3) ^ (4 > 2)));
		System.out.println("xor (2<3)^(1>2)" + ((2 < 3) ^ (1 > 2)));
		System.out.println("xor (4<3)^(1>2)" + ((4 < 3) ^ (1 > 2)));

		System.out.println(34 % 3);

	}

	public static boolean isItSmall(int i) {
		if (i < 5) {
			System.out.println("i < 5 ");
			return true;
		} else {
			System.out.println("i >= 5 ");
			return false;
		}
	}

	static void m2(A a) {
		if (a instanceof B) {
			((B) a).facaAcoesDeB();
		}
	}

}

class A {

}

class B extends A {

	public void facaAcoesDeB() {
		System.out.println(" a possui referencia a B");

	}

}

class C {
}
