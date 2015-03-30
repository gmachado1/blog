package br.com.blog.gmachado1.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.blog.gmachado1.model.Surfista;
import br.com.blog.gmachado1.servicos.ServicosComuns;

public class TestandoArrayList {

	public static void main(String args[]) {

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

		// List<Campeonatos> campeonatos1 = new ArrayList<Surf>(); //ERRO
		// Compilacao
		// List<Campeonatos> campeonatos2 = new ArrayList<KiteSurf>(); //ERRO
		// Compilacao
		List<Surf> campeonatos3 = new ArrayList<Surf>();// OK
		List<KiteSurf> campeonatos4 = new ArrayList<KiteSurf>();// OK
		List<WindSurf> campeonatos5 = new ArrayList<WindSurf>();// OK
		List<Campeonatos> campeonatos6 = new ArrayList<Campeonatos>();// OK
		Eventos eventos = new Eventos();
		// eventos.comecarCampeonatos(campeonatos3);// ERRO DE COMPILACAO
		// eventos.comecarCampeonatos(campeonatos4);// ERRO DE COMPILACAO
		// eventos.comecarCampeonatos(campeonatos5);// ERRO DE COMPILACAO
		eventos.comecarCampeonatos(campeonatos6);// OK

		Campeonatos[] campS = new Campeonatos[3];
		campS[0] = new Surf();
		campS[1] = new WindSurf();
		campS[2] = new KiteSurf();
		Campeonatos[] campKS = { new Surf(), new WindSurf(), new KiteSurf() };
		Surf[] surf = { new Surf(), new Surf(), new Surf() };
		KiteSurf[] kiteSurf = { new KiteSurf(), new KiteSurf(), new KiteSurf() };
		WindSurf[] windSurfs = { new WindSurf() };

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
		camps.add(new Surf());
		camps.add(new KiteSurf());
		camps.add(new WindSurf());
		camps.addAll(windSurfs2);
		camps.addAll(surf2);
		camps.addAll(kiteSurf2);
		System.out.println("$$$$");
		eventos.realizarEventos(surf);// OK
		eventos.realizarEventos(kiteSurf);// OK
		eventos.realizarEventos(windSurfs);// OK

		eventos.realizarEventosC(surf2); // <? extends Campeonatos>
		eventos.realizarEventosC(kiteSurf2);// <? extends Campeonatos>
		eventos.realizarEventosC(windSurfs2);// <? extends Campeonatos>
		eventos.realizarEventosC(camps);// <? extends Campeonatos>
		eventos.realizarEventosSurf(camps);// <? super Surf>
		
		List<Surfista> competidores  = Surfista.mockSurfistas();// criamos uma lista de surfista
		Campeonatos<Surfista> campeonatoSurf = new Campeonatos(quatro, competidores);

	}
}

class Campeonatos<T> {

	private List<T> competidores;// podem ser surfistas, windsurfistas,
									// kiteSurfistas
	private int numeroDeCompetidores;

	public Campeonatos(int numeroCompetidores, List<T> competidores) {
		// construtor com as mesmas caracteristicas surfistas, windsurfistas,
		// kiteSurfistas
		this.competidores = competidores;
		this.numeroDeCompetidores = numeroCompetidores;
	}

	public T getCompetidor() {
		return competidores.get(0);
	}

	public void setCompetidores(T competidor) {
		competidores.add(competidor);
	}

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

	public void comecarCampeonatos(List<Campeonatos> campeonatos) {
		for (Campeonatos c : campeonatos) {
			c.preRequisistos();
		}
	}

	public void realizarEventos(Campeonatos[] listaDeEventos) {
		System.out.println("array");
		for (Campeonatos c : listaDeEventos) {
			c.preRequisistos();
		}
	}

	public void realizarEventosC(ArrayList<? extends Campeonatos> listaDeEventos) {
		System.out.println("arrayList");// nao se pode adicionar aqui
		for (Campeonatos c : listaDeEventos) {
			c.preRequisistos();
		}
	}

	public void realizarEventosSurf(ArrayList<? super Surf> listaDeEventos) {
		System.out.println("arrayList");
		listaDeEventos.add(new Surf());

	}
}