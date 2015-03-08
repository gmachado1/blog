package br.com.blog.gmachado1.threadsExamples;

import br.com.blog.gmachado1.threadsExamples.models.NameList;

public class TestandoClassesSyncronized {

	public static void main(String ...args){
		final NameList n1= new NameList();
		n1.add("ozeas");
		class NameDropper extends Thread{
			public void run(){
				String name = n1.removeFirst();
				System.out.println(name);
			}
		}
		Thread t1 = new NameDropper();
		Thread t2 = new NameDropper();
		t1.start();
		t2.start();
	}
}
