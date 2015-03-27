package br.com.blog.gmachado1.servicos;

import java.util.Iterator;
import java.util.List;

public class ServicosComuns {

	public int calculaSoma(List lista) {
		Iterator it = lista.iterator();
		int toReturn = 0;
		while(it.hasNext()){
			int i = ((Integer)it.next()).intValue();
			toReturn +=i;
		}
		return toReturn;
	}
	
	public void soma(List lista) {
		lista.add((Integer)23);
	}
	public void somaStr(List lista) {
		lista.add(new String("32"));
	}

}
