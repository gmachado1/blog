package br.com.blog.gmachado1.threadsExamples.runnables;

public class Runnable1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Trabalho importante sendo executado");
		for(int i=0;i<6;i++){
			System.out.println("Runnable "+i+" - "+Thread.currentThread().getName());
		}
	}

}
