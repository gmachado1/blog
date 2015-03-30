package br.com.blog.gmachado1.genericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.blog.gmachado1.model.Surfista;

public class TestandoGenericos {

	public static void main(String... args) {
		ArrayList<String> listaGen = new ArrayList<String>();
		ArrayList lista = new ArrayList();
		listaGen.add("teste 1");// ok
		lista.add("teste 1");// ok
		// listaGen.add(2);//erro de compilacao
		lista.add(2);// ok
		// listaGen.add(new Surfista());//erro de compilacao
		lista.add(new Surfista());// ok

		List<Integer> nums = new ArrayList<Integer>(); // versao5
		nums.add(5);// versao5
		List numsV4 = new ArrayList();// versao4
		numsV4.add(new Integer(5));// versao4
		System.out.println("comecando classe testando array");
		System.out.println(nums);// OK
		System.out.println(numsV4);// ok
		Adiciona ad = new Adiciona();
		ad.somaItemInt(nums, " genérica ");
		ad.somaItemInt(numsV4, " não genérica ");
		System.out.println(nums);// OK
		System.out.println(numsV4);// ok
		System.out.println("ATE AQUI TUDO BEM!!");
		System.out.println("E AQUI?");
		ad.somaItemString(nums, " genérica ");
		ad.somaItemString(numsV4, " não genérica ");
		System.out.println(nums);// OK
		System.out.println(numsV4);// ok
		System.out.println("Total ?");
		System.out.println(ad.calculaItem(nums, "generica"));// OK
		System.out.println(ad.calculaItem(numsV4, "não generica"));// ok
		System.out.println(nums);// OK
		System.out.println(numsV4);// ok

	}
}

class Adiciona {
	void somaItemInt(List lista, String tentativa) {
		try{
			lista.add(2);// versao5
			lista.add(3);// versao5
			lista.add(7);// versao5
		}catch(Exception e){System.out.println("somaItemInt: tentativa - " + tentativa);}
	}
	void somaItemString(List lista, String tentativa) {
		try{
		lista.add("texto");// versao4
		}catch(Exception e){System.out.println("somaItemString: tentativa -" + tentativa);}
	}

	int calculaItem(List lista, String tentativa) {
		int total = 0;
		Iterator it = lista.iterator();
		try {
			while (it.hasNext()) {
				total += ((Integer) it.next()).intValue();
			}
		} catch (Exception e) {
			System.out.println("calculaItem: tentativa -" + tentativa);
		}
		return total;
	}
}