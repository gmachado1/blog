package br.com.blog.gmachado1.genericos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarSearch {

	public static void main(String args[]){
		
		int [] listIt = {1,2,4,5,6};
		Arrays.sort(listIt);
		if(Arrays.binarySearch(listIt, 3)!=0){
			System.out.println(Arrays.binarySearch(listIt, 3));
		}
		
		
		String [] manobras = {"Snaking","Cutback","Pump","Floater","Re-entry"};
		Arrays.sort(manobras);
		for(String s:manobras)
			System.out.print(s+" - ");
		System.out.println("\nmanobras1:CutBack = "+Arrays.binarySearch(manobras, "Cutback"));
		System.out.println("ordem decrescente");
		DescSorcComparator dsc=new DescSorcComparator();
		Arrays.sort(manobras,dsc);
		for(String s:manobras)
			System.out.print(s+" - ");
		System.out.println("\nmanobras2:CutBack"+Arrays.binarySearch(manobras, "Cutback"));
		System.out.println("manobras3:CutBack  "+Arrays.binarySearch(manobras, "Cutback",dsc));
		//##################  LISTS
		System.out.println("##################  LISTS");
		for(String s:manobras)
			System.out.print(s+ " - ");
		System.out.println();
		List lista = Arrays.asList(manobras);
		System.out.println("tamanho : "+lista.size());
		System.out.println("indice 3: "+lista.get(3));
		lista.set(3,"Aéreo");
		manobras[1]="Shoulder";
		for(String s:manobras)
			System.out.print(s+ " - ");
		System.out.println("\nindice 1: "+lista.get(1));
	}
	static class DescSorcComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
		
	}
}
