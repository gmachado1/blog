package br.com.blog.gmachado1.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.blog.gmachado1.model.Surfista;
import br.com.blog.gmachado1.servicos.ServicosComuns;

public class TestandoArrayList {

	public static void main(String args[]) {
		List<Integer> nums = new ArrayList<Integer>(); //versao5
		nums.add(5);//versao5
		List numsV4 = new ArrayList();//versao4
		numsV4.add(new Integer(4));//versao4
		System.out.println("comecando classe testando array");
		System.out.println(nums);//OK
		System.out.println(numsV4);//??
		nums.add(2);//versao5
		nums.add(3);//versao5
		nums.add(7);//versao5
		Integer i = new Integer(0);
		Collections.sort(nums);
		System.out.println(nums);
		List<String> test = new ArrayList<String>();
		String s = "hang loose";
		test.add(s);
		test.add("Waikiki");
		System.out.println(test.contains("waikiki"));
		System.out.println(test.contains(2));
		System.out.println(test.size());
		System.out.println(test.contains("hang loose"));
		test.remove("hang loose");
		System.out.println(test.size());

		List<String> placesToSurf = new ArrayList<String>();
		placesToSurf.add("Fernando de Noronha");
		placesToSurf.add("Lima");
		placesToSurf.add("Piura");
		placesToSurf.add("Punta Hermosa");
		placesToSurf.add("Punta Rocas");
		placesToSurf.add("Senhoritas");
		placesToSurf.add("La Isla");
		System.out.println(placesToSurf);
		String d = "";
		Collections.sort(placesToSurf);
		System.out.println(placesToSurf);

		List<Surfista> surfistas = new ArrayList<Surfista>();
		surfistas = Surfista.mockSurfistas();// carrega listas de surfistas 
		System.out.println(surfistas);
		Collections.sort(surfistas);
		System.out.println(surfistas);
		Surfista s3 = new Surfista();
		Collections.sort(surfistas, s3);
		System.out.println(surfistas);
		surfistas.iterator();

		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(3);
		ServicosComuns sc = new ServicosComuns();
		int total = sc.calculaSoma(lista);
		System.out.println(total);
		sc.soma(lista);
		total = sc.calculaSoma(lista);
		System.out.println(total);
		sc.somaStr(lista);// addiciona na lista
		try {
			total = sc.calculaSoma(lista);// deu ruim
		} catch (ClassCastException e) {
			System.out.println("deu ruim");
		}
		System.out.println(total);

		List teste = new ArrayList();
		teste.add(4);
		int quatro = (int) teste.get(0);
		quatro = (Integer) teste.get(0);
		// quatro = teste.get(0); erro de compilacao
		List<Integer> teste2 = new ArrayList<Integer>();
		teste2.add(4);
		quatro = teste2.get(0);

		// List<Campeonatos> campeonatos = new ArrayList<Surf>(); ERRO
		// Compilacao
		// List<Campeonatos> campeonatos = new ArrayList<KiteSurf>(); ERRO
		// Compilacao
		List<Campeonatos> campeonatos = new ArrayList<Campeonatos>();// OK
		Campeonatos[] campS = new Surf[4];
		Campeonatos[] campKS = new KiteSurf[4];
		Surf[] surf = { new Surf(), new Surf(), new Surf() };
		KiteSurf[] kiteSurf = { new KiteSurf(), new KiteSurf(), new KiteSurf() };
		WindSurf[] windSurfs = { new WindSurf() };
		Eventos eventos = new Eventos();
		eventos.realizarEventos(surf);
		eventos.realizarEventos(kiteSurf);
		eventos.realizarEventos(windSurfs);

		ArrayList<Surf> surf2 = new ArrayList<Surf>();
		surf2.add(new Surf());
		surf2.add(new Surf());
		surf2.add(new Surf());
		ArrayList<KiteSurf> kiteSurf2 = new ArrayList<KiteSurf>();
		kiteSurf2.add(new KiteSurf());
		kiteSurf2.add(new KiteSurf());
		kiteSurf2.add(new KiteSurf());
		ArrayList<WindSurf> windSurfs2 = new ArrayList<WindSurf>();
		windSurfs2.add(new WindSurf());
		ArrayList<Campeonatos> camps = new ArrayList<Campeonatos>();
		camps.addAll(windSurfs2);
		camps.addAll(surf2);
		camps.addAll(kiteSurf2);
		System.out.println("$$$$");
		eventos.realizarEventos(surf2); //Erro de tipo de argumento
		eventos.realizarEventos(kiteSurf2);//Erro de tipo de argumento
		eventos.realizarEventos(windSurfs2);//Erro de tipo de argumento
		eventos.realizarEventos(camps);
		eventos.realizarEventosSurf(camps);
	}
}

class Campeonatos {
	public void preRequisistos() {
		System.out.print("necessário prancha ");
	}
}

class Surf extends Campeonatos {
	public void preRequisistos() {
		super.preRequisistos();
		System.out.println("e ondas!");
	}
}

class KiteSurf extends Campeonatos {
	public void preRequisistos() {
		super.preRequisistos();
		System.out.println("e ventos e pipa!");
	}
}

class WindSurf extends Campeonatos {
	public void preRequisistos() {
		super.preRequisistos();
		System.out.println("e ventos e vela!");
	}
}

class Eventos {
	public void realizarEventos(Campeonatos[] listaDeEventos) {
		System.out.println("array");
		for (Campeonatos c : listaDeEventos) {
			c.preRequisistos();
		}
	}

	public void realizarEventos(ArrayList<? extends Campeonatos> listaDeEventos) {
		System.out.println("arrayList");//nao se pode adicionar aqui
		for (Campeonatos c : listaDeEventos) {
			c.preRequisistos();
		}
	}
	public void realizarEventosSurf(ArrayList<? super Surf> listaDeEventos) {
		System.out.println("arrayList");
		listaDeEventos.add(new Surf());
//		for (Surf c : listaDeEventos) {
//			c.preRequisistos();
		//}
	}
}