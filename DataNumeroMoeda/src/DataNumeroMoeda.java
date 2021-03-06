import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DataNumeroMoeda {

	public static void main(String... args) {
		System.out.println("comecando");
		Date d1 = new Date(1000000000000L);// um trilhao 1 jan 1970
		System.out.println("primeira data: " + d1.toString());
		d1.setTime(d1.getTime() + 3600000); //getTime pega o tempo e acrescenta 3600000 milissegundos
		System.out.println("nova data: " + d1.toString());
		Date now = new Date();
		System.out.println("data agora: " + now.getTime());

		Calendar c = Calendar.getInstance();
		c.setTime(d1); // atribui uma data a instancia Calendar
		if (c.SUNDAY == c.getFirstDayOfWeek()) {// verificamos se domingo é o
												// primeiro dia da semana(alguns
												// lugares é segunda)
			System.out.println("Domingo é o primeiro dia da semana.");
		}
		System.out
				.println("em que dia da semana caiu o trilhonesimo milisegundo: "
						+ c.get(c.DAY_OF_WEEK));// em que dia da semana caiu o
		// trilhonesimo milisegundo
		c.add(Calendar.MONTH, 1);// adiciona um mes

		Date d2 = c.getTime();// converte o valor em uma instancia Date
		System.out.println("nova data" + d2.toString());

		// formatando data
		Date d3 = new Date(1000000000000L);
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance(); 
		dfa[1] = DateFormat.getDateInstance();//08/09/01 22:46<< 
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT); //08/09/2001<< 
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);//08/09/01<< 
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);//08/09/2001<< 
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);//8 de Setembro de 2001<<

		for (DateFormat d : dfa) {
			System.out.println(d.format(d3) + "<< ");
		}


		Date d4 = new Date(1000000000000L);
		System.out.println("d4=" + d4.toString());

		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

		String s = df.format(d4);
		System.out.println("s-d4 = " + s);

		try {
			Date d5 = df.parse(s);
			System.out.println("d5 = " + d5.toString());
		} catch (ParseException p) {
			p.printStackTrace();
		}

		// Locale

		Calendar c1 = Calendar.getInstance();
		c1.set(2014, 9, 14);
		Date d6 = c1.getTime();

		Locale locIt = new Locale("it", "IT");// italia
		Locale locPt = new Locale("pt");// portugal
		Locale locBr = new Locale("pt", "BR");// brasil
		Locale locIn = new Locale("hi", "In");// india
		Locale locJa = new Locale("ja");// japao

		DateFormat dfUS = DateFormat.getInstance();
		System.out.println("US" + dfUS.format(d6));

		DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("US- full -Hamburguer: " + dfUS.format(d6));

		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIt);
		System.out.println("Italia -Espaguete: " + dfIT.format(d6));

		DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPt);
		System.out.println("Portugal - Bacalhau: " + dfPT.format(d6));

		DateFormat dfBr = DateFormat.getDateInstance(DateFormat.FULL, locBr);
		System.out.println("Brasil - Feijoada: " + dfBr.format(d6));

		DateFormat dfIn = DateFormat.getDateInstance(DateFormat.FULL, locIn);
		System.out.println("India- Chaat de Mumbai: " + dfIn.format(d6));

		DateFormat dfJp = DateFormat.getDateInstance(DateFormat.FULL, locJa);
		System.out.println("Japão- Suchi: " + dfJp.format(d6));

		Calendar c2 = Calendar.getInstance();
		c2.set(2014, 9, 19);

		Date d7 = c2.getTime();
		Locale locBR = new Locale("pt", "BR");// Brasil
		Locale locDK = new Locale("da", "DK");// Dinamarca
		Locale locIT = new Locale("it", "IT");// Italia
		System.out.println("pais");
		System.out.println("def-" + locBR.getDisplayCountry());
		System.out.println("loc-" + locBR.getDisplayCountry(locBR));

		System.out.println("\ndef-" + locDK.getDisplayCountry());
		System.out.println("bra-" + locDK.getDisplayCountry(locBR));
		System.out.println("loc-" + locDK.getDisplayCountry(locDK));
		System.out.println("d>I-" + locDK.getDisplayCountry(locIT));
		System.out.println("Lingua");
		System.out.println("\ndef-" + locDK.getDisplayLanguage());
		System.out.println("bra-" + locDK.getDisplayLanguage(locBR));
		System.out.println("loc-" + locDK.getDisplayLanguage(locDK));
		System.out.println("d>I-" + locDK.getDisplayLanguage(locIT));

		// NumberFormat
		float f1 = 123.4567f;
		Locale locFr = new Locale("fr");
		NumberFormat[] nfa = new NumberFormat[4];

		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFr);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFr);
		for (NumberFormat nf : nfa) {
			System.out.println(nf.format(f1));
		}

		float f2 = 123.4567f;
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits() + " ");
		System.out.println(nf.format(f2) + " ");

		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(f2) + " ");

		try {
			System.out.println(nf.parse("1234.567"));
			nf.setParseIntegerOnly(true);
			System.out.println("1234.567");
		} catch (ParseException pex) {
			pex.printStackTrace();
		}
	}
}
