package br.com.blog.gmachado1.genericos;

import java.util.HashMap;
import java.util.Map;

import br.com.blog.gmachado1.model.Hauli;
import br.com.blog.gmachado1.model.Surfista;

public class TestandoMap {

	public static void main(String args[]){
		Map<Object,Object> ml = new HashMap<Object,Object>();
		ml.put("t1", new Surfista("Gustavo Machado","Gus",32,2));
		ml.put("t2", Thread.MAX_PRIORITY);
		ml.put(Thread.MIN_PRIORITY, "Prioridade minima");
		Surfista s = Surfista.mockSurfistas().get(0);
		ml.put(s, "Medina");
		ml.put(new Hauli(), "Hauli");
		ml.put(3, "numeral 3");
		
		System.out.println(ml.get("t1"));
		String t2 = "t2";//teste2
		System.out.println(ml.get(t2));
		int t=1;//Thread.MIN_PRIORITY
		System.out.println(ml.get(t));
		System.out.println(ml.get(Thread.MIN_PRIORITY));
		System.out.println(ml.get(s));
		System.out.println(ml.get(new Hauli()));
		System.out.println(ml.size());
				
				
	}
}


