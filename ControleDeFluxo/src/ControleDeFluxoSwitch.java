public class ControleDeFluxoSwitch {

	public static void main(String[] args) {

		// exemplo tradicional de switch
		int x = 3;
		switch (x) {
		case 1:
			System.out.println("valor de x é 1");
			break;
		case 2:
			System.out.println("valor de x é 2");
			break;
		case 3:
			System.out.println("valor de x é 3");
			break;
		case 4:
			System.out.println("valor de x é 4");
			break;
		case 5:
			System.out.println("valor de x é 5");
			break;
		default:
			System.out.println("valor de x é desconhecido.");
		}

		final int a = 1;
		int b = 5;
		int z = 0;
		switch (z) {
		case a: // ok
			// case b: // erro de compilacao por b não ser uma constante
		}

		String s = "xyz";
		switch (s.length()) {
		case 1:
			System.out.println("length is one,");
			break;
		case 2:
			System.out.println("length is two");
			break;
		case 3:
			System.out.println("length is three");
			break;
		default:
			System.out.println("no match");
		}

		byte g = 2;
		switch (g) {
		// case -128: //erro
		// System.out.println("-128");
		case -127:
			System.out.println("-127");
		case 127:
			System.out.println("127");
			// case (byte) 128: //erro
			// System.out.println("128");
		}

		// exemplo sem break
		int x2 = 3;
		switch (x2) {
		case 1:
			System.out.println("valor de x é 1");
		case 2:
			System.out.println("valor de x é 2");
		case 3:
			System.out.println("valor de x é 3");
		case 4:
			System.out.println("valor de x é 4");
		case 5:
			System.out.println("valor de x é 5");
		default:
			System.out.println("valor de x é?");
		}

		// exemplo sem break e com chaves
		int k = 3;
		switch (k) {
		case 1: {
			System.out.println("valor de x é 1");
		}
		case 2: {
			System.out.println("valor de x é 2");
		}
		case 3: {
			System.out.println("valor de x é 3");
		}
		case 4: {
			System.out.println("valor de x é 4");
		}
		case 5: {
			System.out.println("valor de x é 5");
		}
		default: {
			System.out.println("valor de x é?");
		}
		}

	}
}
