package br.com.blog.gmachado1.threadsExamples;

import br.com.blog.gmachado1.threadsExamples.runnables.RunnableSleep;
import br.com.blog.gmachado1.threadsExamples.threadExtends.ThreadSleep;

public class ExecutandoThreads1 {

	public static void main(String... args) {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		ThreadSleep t3 = new ThreadSleep();
		
		RunnableSleep r = new RunnableSleep();
		Thread r1 = new Thread(r);
		Thread r2 = new Thread(r);
		Thread r3 = new Thread(r);

		t1.setName("Thread 1");
		r1.setName("Runnable 1");
		r2.setName("Runnable 2");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		r3.setName("Runnable 3");
		
		t1.start();
		r1.start();
		r2.start();
		t2.start();
		t3.start();
		r3.start();
		
	}
}
