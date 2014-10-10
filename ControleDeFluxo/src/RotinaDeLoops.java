import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RotinaDeLoops {

	public static void main(String[] args) {

		// exemplo tradicional de while
		int x = 2;
		while (x == 2) {
			System.out.println(x);
			++x;
		}

		// exemplo de nao entrada ao loop while
		int y = 8;
		while (y > 8) {
			System.out.println("no loop");
			x = 10;
		}
		System.out.println("saiu do loop \n\n\n");

		// exemplo de DO

		do {
			System.out.println("expressão do");
			y++;
		} while (y > 9);
		System.out.println("\n\n\n");
		// exemplo de for

		for (int g = 0; g < 3; g++) {
			System.out.println("Imprime o valor de G:" + g);
		}
		System.out.println("\n\n\n");

		// exemplo de for com condicao mais complexa

		y = 8;
		for (x = 0; ((((x < 10) && (y-- > 2)) | x == 3)); x++) {
			System.out.println("Imprime o valor de x: " + x + " e Y: " + y);
		}
		System.out.println("\n\n\n");

		// exemplo de mais de uma iteração
		int i = 5;
		y = 5;
		for (int g = 0; g < 3; g++, --i, y = y * 2) {
			System.out.println("Imprime o valor de G:" + g);// funciona
			System.out.println("Imprime o valor de I:" + i);// funciona
			System.out.println("Imprime o valor de Y:" + y);// funciona
		}

		System.out.println("\n\n\n");
		// exemplo de for infinito
		x = 0;
		for (;;) {
			System.out.println("Ao Infinito e aléém! X:" + x);
			x++;
			if (x == 10) {
				break; // return ou em ultimo caso System.exit(1);
			}
		}

		// exemplo de for

		int[] lista = { 1, 2, 3, 4 };

		for (int t = 0; t < lista.length; t++) {
			System.out.print(lista[t]);
		}
		
		int a = 0;
		for (int t = 0; t < lista.length; t++) {
			System.out.print(lista[t]);
			a++;
			if(a>2){
				break;
			}
			
		}
		

		for (int n : lista) {
			System.out.print(n);
		}

		int[][] twoDee = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.print("\n\n");
		for (int[] n : twoDee) {
			System.out.print(n);
			System.out.print("\n");
		}
		System.out.print("\n\n");
		for (int n2 : twoDee[2]) {
			System.out.print(n2);
			System.out.print("\n");
		}

		boolean isTrue = true;
		outer: for (int k = 6; k < 5; k++) {
			while (isTrue) {
				System.out.println("ola");
				break outer;
			} // fim do loop for interno
			System.out.println("Esta parte do codigo não sera executada");// nao
																			// sera
																			// executado
		}

		List<Pessoas> listaDepessoas = new ArrayList<Pessoas>();
		
		listaDepessoas.addAll(Pessoas.carregaListaDePessoas());

		for (Pessoas p : listaDepessoas) {
			if (p.isHomem()) {
				continue;
			}

			System.out.println(p.getNome());
			// insira o código enorme aqui para as mulheres aqui
		}

		nomeExemplo: for (;;) {
			int i2 = 0;
			teste: for (Pessoas p2 : listaDepessoas) {
				if (p2.isHomem()) {
					continue teste;
				}
				System.out.println(p2.getNome());
				// insira o código enorme aqui para as mulheres aqui
				i2++;
				if (i2 == 3) {
					break nomeExemplo;
				}
			}
		}
		
		System.out.println("tichau");

	}

	
}
