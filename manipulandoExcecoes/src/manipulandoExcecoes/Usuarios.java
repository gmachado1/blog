package manipulandoExcecoes;


import java.util.ArrayList;
import java.util.List;

public class Usuarios {

	private String nome;
	private boolean homem;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isHomem() {
		return homem;
	}

	public void setHomem(boolean homem) {
		this.homem = homem;
	}

	public static List<Usuarios> carregaListaDeUsuarios() {
		List<Usuarios> listaDeUsuarios = new ArrayList<Usuarios>();
		Usuarios e = new Usuarios();
		e.setHomem(true);
		e.setNome("Gustavo");
		listaDeUsuarios.add(e);

		e = new Usuarios();
		e.setHomem(true);
		e.setNome("Roberto");
		listaDeUsuarios.add(e);

		e = new Usuarios();
		e.setHomem(false);
		e.setNome("Maria");
		listaDeUsuarios.add(e);

		e = new Usuarios();
		e.setHomem(true);
		e.setNome("José");
		listaDeUsuarios.add(e);

		e = new Usuarios();
		e.setHomem(false);
		e.setNome("Karina");
		listaDeUsuarios.add(e);

		e = new Usuarios();
		e.setHomem(false);
		e.setNome("Luciana");
		listaDeUsuarios.add(e);

		e = new Usuarios();
		e.setHomem(false);
		e.setNome("Hamilton");
		listaDeUsuarios.add(e);

		e = new Usuarios();
		e.setHomem(false);
		e.setNome("Tania");
		listaDeUsuarios.add(e);

		return listaDeUsuarios;
	}
	
}
