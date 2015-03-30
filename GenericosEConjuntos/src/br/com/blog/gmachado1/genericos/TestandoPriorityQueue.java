package br.com.blog.gmachado1.genericos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

import br.com.blog.gmachado1.genericos.PQ.PQsort;
import br.com.blog.gmachado1.genericos.PQ.PQsortString;
import br.com.blog.gmachado1.model.Surfista;

	public class TestandoPriorityQueue {
	
		public static void main(String args[]) {
			int[] ia = { 1, 5, 4, 9, 2, 6, 7, 0 };
			ArrayList<String> listaGen = new ArrayList<String>();
			ArrayList lista = new ArrayList();
			listaGen.add("teste 1");
			lista.add("teste 1");
	//		listaGen.add(2);
			lista.add(2);
		//	listaGen.add(new Surfista());
			lista.add(new Surfista());
			
			String teste1 = listaGen.get(0);//ok
			Object teste3 = lista.get(0);
			
			PriorityQueue<Integer> pqi = new PriorityQueue<Integer>();
	
			for (int i : ia)
				pqi.offer(i);
			for (int x : ia)
				System.out.print(pqi.poll() + " ");
			System.out.println();
			PQsort pqs = new PQsort();
			PriorityQueue<Integer> pqi2 = new PriorityQueue<Integer>(10, pqs);
			for (int i : ia)
				pqi2.offer(i);
			System.out.println("tamanho : " + pqi2.size());
			System.out.println("peek : " + pqi2.peek());
			System.out.println("tamanho : " + pqi2.size());
			System.out.println("poll : " + pqi2.poll());//remove da lista
			System.out.println("tamanho : " + pqi2.size());
			for (int i : ia) {
				System.out.print(": " + pqi2.poll());
			}
			
			
			
			System.out.println("\ncom Strings");
			
			String[] sa = { ">g<", "> g<", ">g <", ">G<",">GG<"  };
			PriorityQueue<String> pqS = new PriorityQueue<String>();
	
			for (String i :sa )
				pqS.offer(i);
			for (String x : sa)
				System.out.print(pqS.poll() + " ");
			System.out.println();
			PQ.PQsortString pqSort = new PQsortString();
			PriorityQueue<String> pqs2 = new PriorityQueue<String>(10, pqSort);
			for (String i : sa)
				pqs2.offer(i);
			System.out.println("tamanho : " + pqs2.size());
			System.out.println("peek : " + pqs2.peek());
			System.out.println("tamanho : " + pqi2.size());
			System.out.println("poll : " + pqs2.poll());//remove da lista
			System.out.println("tamanho : " + pqs2.size());
			for (String i : sa) {
				System.out.print(": " + pqs2.poll());
			}
	
		}
	
	}
	
	class PQ {
		static class PQsort implements Comparator<Integer> {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		}
		static class PQsortString implements Comparator<String> {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		}
	}