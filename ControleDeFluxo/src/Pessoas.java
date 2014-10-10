import java.util.ArrayList;
import java.util.List;

public class Pessoas {

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

	public static List<Pessoas> carregaListaDePessoas() {
		List<Pessoas> listaDepessoas = new ArrayList<Pessoas>();
		Pessoas e = new Pessoas();
		e.setHomem(true);
		e.setNome("Gustavo");
		listaDepessoas.add(e);

		e = new Pessoas();
		e.setHomem(true);
		e.setNome("Roberto");
		listaDepessoas.add(e);

		e = new Pessoas();
		e.setHomem(false);
		e.setNome("Maria");
		listaDepessoas.add(e);

		e = new Pessoas();
		e.setHomem(true);
		e.setNome("José");
		listaDepessoas.add(e);

		e = new Pessoas();
		e.setHomem(false);
		e.setNome("Karina");
		listaDepessoas.add(e);

		e = new Pessoas();
		e.setHomem(false);
		e.setNome("Janaina");
		listaDepessoas.add(e);

		e = new Pessoas();
		e.setHomem(false);
		e.setNome("Julia");
		listaDepessoas.add(e);

		e = new Pessoas();
		e.setHomem(false);
		e.setNome("Tania");
		listaDepessoas.add(e);

		return listaDepessoas;
	}
}
