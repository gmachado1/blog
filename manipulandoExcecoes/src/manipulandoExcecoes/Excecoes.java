package manipulandoExcecoes;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Excecoes {

	public static void main(String args[]) {
		System.out.println("comecando a parte de exções! \n");

		try {
			// aqq codigo aqui

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			// exemplo de roollback
		}

		try {
			RandomAccessFile raf = new RandomAccessFile("arquivo.txt", "r");
			byte b[] = new byte[1000];
			raf.readFully(b, 0, 1000);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO error");
			System.out.println(e.toString());
			e.printStackTrace();

		}

		try {
			metodo();
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		
		metodoRunTime();
				
		ordenarUsuarios(Usuarios.carregaListaDeUsuarios());

	}

	static void metodo() throws IOException {
		faca();

	}

	static void faca() throws IOException {
		System.out.println("fazendo algo");
		throw new IOException();
	}

	static void metodoRunTime() throws RuntimeException {
		facaRunTime();

	}

	static void facaRunTime() {
		System.out.println("fazendo algo");
		throw new RuntimeException();
	}
	
	void facaAlgo() {
		try {
			doMore();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void doMore() throws IOException {
		throw new IOException();
	}

	public int myMethodl() throws EOFException {
		return myMethod2();
	}

	public int myMethod2() throws EOFException {
		// Ponha aqui algum
		return 1;
	}

	public void myMethod3() {
		// Ponha aqui algum c6digo que jogue uma NullPointerException
	}

	void testandoExcecao() {
		// testandoMinhaExcecao();
	}

	public void testandoMinhaExcecao() throws MinhaExcecao {
		try {
			throw new MinhaExcecao();
		} catch (MinhaExcecao me) {
			throw me;
		}
	}

	public static void ordenarUsuarios(List usuarios) {
		List retorno = new ArrayList<Usuarios>();
		try {
			retorno = ordenarUsuariosPFisica(usuarios);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Ocorreu erro, tamanho da lista atual="
					+ usuarios.size());
			e.getMessage();
		} finally {

		}
	}

	private static List<Usuarios> ordenarUsuariosPFisica(List<Usuarios> usuarios)
			throws IndexOutOfBoundsException {
		List retorno = new ArrayList<Usuarios>();
		retorno = ordenarUsuariosAtivos(usuarios);

		return retorno;
	}

	private static List ordenarUsuariosAtivos(List<Usuarios> usuarios)
			throws IndexOutOfBoundsException {
		List<Usuarios> retorno = usuarios;
		Usuarios u = new Usuarios();
		for (int i = 0; i < usuarios.size(); i++) {
			for (int j = i + 1; j < usuarios.size(); j++) {
				if (retorno.get(i).getNome().charAt(0) > usuarios.get(j)
						.getNome().charAt(0)) {
					u = retorno.get(j);
					usuarios.set(j, retorno.get(i));
					retorno.set(i, u);
				}
				u = new Usuarios();
			}
		}

		// imprimindo e dando erro
		int a = 0;
		do {
			System.out.println(retorno.get(a).getNome());
			a++;
		} while (a - 1 < retorno.size());
		return retorno;
	}

}