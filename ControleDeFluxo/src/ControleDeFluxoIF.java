public class ControleDeFluxoIF {

	public static void main(String[] args) {

		// exemplo tradicional de if
		int x = 3;
		if (x == 3) {
			System.out.println("x � igual a 3. \n");
		} else {
			System.out.println("� diferente. \n");
		}

		// exemplo de if sem else
		if (x < 5) {
			System.out.println("x e menor q 5. \n");
		}

		// exemplo de if sem chaves
		if (x == 3)
			System.out.println("x � igual a 3. ");
		
		if (x > 3)
			System.out.println("x � maior que 3. ");
		else
			System.out.println("� menor ou igual a 3. ");
		System.out.println("esta fora do if sem chaves. \n");

		// exemplo de aninhamento de ifs
		if (x <= 5) {
			System.out.println("x � menor que 5 .");
			if (x >= 4) {
				System.out.println("x � maior ou igual a 4 ");
			} else {
				System.out.println("x n�o � maior nem igual a 4 ");
				if (x == 1) {
					System.out.println("x � igual a 1 ");
				} else {
					if (x == 2) {
						System.out.println("x � igual a 2 ");
					} else {
						System.out
								.println("x � igual a 3 !! s� sobrou este. \n");
					}
				}
			}
		} else {
			System.out.println("� maior que 5 ");
		}
		System.out.println("saiu do if aninhado  \n");

		// exemplo de aninhamento de ifs
		if (x == 5) {
			System.out.println("x � igual a 5 .");
		} else if (x == 4) {
			System.out.println("x � igual a 4 ");
		} else if (x == 3) {
			System.out.println("x � igual a 3 ");
		} else if (x == 2) {
			System.out.println("x � igual a 2 ");
		} else if (x == 1) {
			System.out.println("x � igual a 1 ");
		}
		System.out.println("saiu do else if.  \n");

		
        int a = 5;
        int b = 2;
        if ((a>3)&&((b<2)|| true )){
              System. out .println("(((passou if)))" );
       } else {
              System. out .println( "(((passou else)))");
       }
       
        if ((a>3)&&(b<2)||true){
              System. out .println("(((passou de novo if)))" );
       } else {
              System. out .println("(((passou de novo else)))" );
       }

		System.out.println("(((fim))) \n\n");
		
		boolean t = false;
		if (t = true) {
			System.out.println("Sempre passar� por aqui!");
		}
		
		//exemplo de tern�rio
		int n1 = 20;
        int n2 = 15;
        int r;
       
        // Aqui o maior valor � o valor1 = 20
        r = n1 > n2 ?n1: n2;
        System.out.println("O Valor escolhido � = " + r);
		System.out.println("exemplor de ternario simples");
		
		r = n1 > n1 ? n1: n1 > n2? 4 : 5;
		System.out.println("O Valor escolhido � = " + r);
		
	}

}
