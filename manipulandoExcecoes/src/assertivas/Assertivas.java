package assertivas;

import java.util.logging.Logger;

public class Assertivas {

	static Logger log = Logger.getLogger(Assertivas.class.getName());

	public static void main(String args[]) {
		log.info("comecando a parte de Assertivas! \n");
		// try {
		boolean teste = true;
		int num = 1;

		assert (teste);
		assert teste;

		assert (num == 1);

		assert num >= 1;
		assert (num != 1) : "num =" + num; // parte a ser concatenada no erro
		assert (num != 1);
		assert (num != 1) : "num =" + num;
		assert (num == 2) : new String("Um objeto de exemplo");

		switch (num) {
		case 2:
			num = 3;
		case 3:
			num = -7;
		case 4:
			num = 27;
		default:
			assert false; // Não deveriamos nunca chegar até aquil
		}
		// } catch (AssertionError e) {
		// log.info("\n\n\n Erro nos asserts :" +getStackTrace().toString());

		// }
		log.info("\n\n Finalizando a parte de Assertivas! \n");
	}

}
