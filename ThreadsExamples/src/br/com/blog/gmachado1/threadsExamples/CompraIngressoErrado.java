package br.com.blog.gmachado1.threadsExamples;

import br.com.blog.gmachado1.threadsExamples.models.Ingresso;

public class CompraIngressoErrado implements Runnable {

	private Ingresso ingresso = new Ingresso();

	public static void main(String... args) {
		CompraIngressoErrado c = new CompraIngressoErrado();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);

		t1.setName("Cruzeiro");
		t2.setName("Atl-Min");

		t1.start();
		t2.start();

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			validarIngressos(10);
			if (ingresso.getIngressos() < 0)
				System.out.println("Deu problema na venda de ingressos");
		}
	}

	private void validarIngressos(int i) {
		boolean podeComprar = false;

		synchronized (this) {
			if (ingresso.getIngressos() >= i) {
				podeComprar = true;
				ingresso.comprarIngressos(10);
			}
		}
		if (podeComprar) {
			System.out.println(Thread.currentThread().getName()
					+ " fará retirada de ingressos.");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
			
			System.out.println("ingresso comprado por "
					+ Thread.currentThread().getName()
					+ " numero de ingressos " + ingresso.getIngressos());
		} else {
			System.out
					.println("Não possui mais ingressos: numero de ingressos disponiveis "
							+ ingresso.getIngressos());
		}
	}
}
