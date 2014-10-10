

import java.io.*;

public class NavegacaoArquivosE_S {

	public static void main(String args[]) {
		System.out.println("iniciando parte de Navegação e E/S!");

		try {
			File arquivo = new File("arquivo.txt"); // ainda não criou o arquivo
			boolean novoArquivo = arquivo.exists();//false
			System.out.println("Arquivo já existe? " + novoArquivo);//false
			novoArquivo = arquivo.createNewFile(); // procura arquivo
			System.out.println("Arquivo criado ?" + novoArquivo);//true
			System.out.println("Arquivo já existe?" + arquivo.exists());//true
		} catch (IOException ioe) {
			System.out.println("erro no io" + ioe.getMessage());
		}
		
		System.out.println("\n\n\n FileWriter - FileReader");
		try {
			char[] in = new char[50]; // para armazenar 
			int tamanho = 0;

			File arquivo = new File("arquivo2.txt"); // instanciando 

			FileWriter fw = new FileWriter(arquivo); // cria o arquivo
			fw.write("escrevendo algo para"
					+ " testar\nem duas linhas.");//escreve os caracteres no arquivo
			fw.flush(); //limpa
			fw.close(); //fecha arquivo ao terminar

			FileReader fr = new FileReader(arquivo); //Instancia de leitura
			tamanho = fr.read(in);//le arquivo definido o numero de caracteres que serão lidos

			System.out.println("tamanho: " + tamanho);//tamanho lido

			for (char c : in) {
				System.out.println(c);	
			}
			fr.close(); //fechando arquivo.

		} catch (IOException ioe) {
			System.out.println("erro no io" + ioe.getStackTrace());
		}
		
		
		
		try {
			File file = new File("fileWriter2.txt");
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("fala galera");
			pw.println("como vai?");
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String st = br.readLine();
			
			System.out.println(st);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		


		try {
			
			File diretorio = new File ( "D:\\desenv\\java\\blog\\NavegacaoDeArquivos_E-S\\dir" ) ; //caminho
			diretorio.mkdir(); // cria diretório
			
			File file = new File(diretorio,"arquivo.txt"); // estabelece arquivo e o caminho que será criado
			PrintWriter pw = new PrintWriter(file);
			file.createNewFile();// cria arquivo no caminho
			pw.println("fala galera");
			pw.println("como vai?");
			pw. flush();
			pw.close();
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String st = br.readLine();
			
			System.out.println(st);
			
			diretorio.isDirectory(); // true
			diretorio.list(); // lista de tudo interno dentro do diretório
			for(String arquivoOuPasta:diretorio.list()){
				System.out.println(arquivoOuPasta);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		
	}
}
