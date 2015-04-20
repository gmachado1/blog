package br.com.blog.gmachado1.io.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestingIOClasses {

	public static void main(String args[]) {
		System.out.println("Let's begin!");
		example1();
		example1();
		example3();
		example4();
		example5();

	}

	private static void example5() {
		File dir = new File("files//oneMore//");
		dir.mkdir();
		File file = new File(dir, "arquivo.txt");
		try {
			PrintWriter pw = new PrintWriter(file);// cria arquivo no caminho
			try {
				file.createNewFile();// cria arquivo no caminho caso a linha 04
										// não execute e o caminho exista
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void example4() {
		try {
			File file = new File("files//brazilianStorms.txt");
			PrintWriter pw2 = new PrintWriter(file);// can use this
			FileWriter fw = new FileWriter(file);// or this
			PrintWriter pw = new PrintWriter(fw);// just to give options
			pw.println("Jadson André");
			pw.println("Miguel Pupo");
			pw.flush();
			pw.close();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				StringBuilder sb = new StringBuilder(br.readLine());
				System.out.println(sb);
			}
			fr.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void example3() {
		int size = 0;
		File file = new File("files//brazilianStorm.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("Adriando de Souza\nGustavo Machado ");
			fw.flush();
			fw.close();
			FileReader fr = new FileReader(file);
			char[] aux = new char[100];
			size = fr.read(aux);
			fr.close();
			System.out.println("Size = " + size);
			StringBuilder nomes = new StringBuilder();
			for (char c : aux) { // pega valores por char
				nomes.append(c);
			}
			System.out.println(nomes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void example1() {
		File dir = new File("files");// dir
		File file = new File(dir, "surfers.txt");
		boolean isFileCreated = file.exists();
		boolean isDirCreated = dir.exists();

		try {
			System.out.print("is Directory  created ?");
			if (!isDirCreated) {
				System.out.println("No");
				isDirCreated = dir.mkdir();
			} else {
				System.out.println("Yes : createdNewDirectory=" + dir.mkdir());
				System.out.println("is a directory =" + dir.isDirectory());
			}
			System.out.print("is file  created ?");
			if (!isFileCreated) {
				System.out.println("No");
				isFileCreated = file.createNewFile();
			} else {
				System.out.println("Yes : createdNewFile="
						+ file.createNewFile());
				System.out.println("is a file=" + file.isFile());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
