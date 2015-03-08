package br.com.blog.gmachado1.threadsExamples;

public class DataRace {

	public static void main(String args[]) {
		UseCounter c = new UseCounter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}

class Counter {
	public static long count = 0;
}

class UseCounter implements Runnable {
	public void increment() {
		// incrementa ao contador e imprime o valor
		// contador compartilhado entre threads
		Counter.count++;
		System.out.print(Counter.count + " ");
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}