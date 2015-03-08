package br.com.blog.gmachado1.threadsExamples.runnables;

public class RunnableSleep implements Runnable {

	@Override
	public void run() {
		System.out.println("Trabalho importante sendo executado");
		for (int i = 0; i < 6; i++) {
			System.out.println("Runnable " + i + " - "
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("excecao thread!");
			}
		}
	}

}
