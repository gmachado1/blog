package br.com.blog.gmachado1.threadsExamples;

public class Jogo extends Thread {

	Juiz juiz;

	public Jogo(Juiz j) {
		juiz = j;
	}

	public void run() {
		
		synchronized (juiz) {
			System.out.println("e vai comecar o jogo! "+juiz.isApitaIniciarJogo());
			// metodos de organização do jogo por aqui
			int i = 0;
			while (!juiz.isApitaIniciarJogo()) {
				try {
					System.out.println("Quantas vezes deve passar aqui:" + i++);
					// contagem de quantas vezes o loop foi necessário em cada
					// tread
					juiz.wait(2);
					// definimos um tempo pequeno para forcar a utilização do
					// loop
				} catch (InterruptedException e) {
				}
			}
			System.out.println("Ta ai o que vc queria bola rolando ...");
		}
	}

	public static void main(String[] args) {
		Juiz juiz = new Juiz();
		new Jogo(juiz).start();
		new Jogo(juiz).start();
		new Jogo(juiz).start();
		juiz.start();
	}
}

class Juiz extends Thread {

	boolean apitaIniciarJogo = false;

	public boolean isApitaIniciarJogo() {
		return apitaIniciarJogo;
	}

	public void setApitaIniciarJogo(boolean apitaIniciarJogo) {
		this.apitaIniciarJogo = apitaIniciarJogo;
	}

	public void run() {
			synchronized (this) {
				System.out.println("Jogo pestes a comecar. juiz apitou:"
						+ this.isApitaIniciarJogo());
				this.yield();
				// para forcar ao tread juiz sair do estado de
				// execução e por sua vez demosntrarmos o loop linha 17
				setApitaIniciarJogo(true);
				System.out.println("Apita o Juiz!");
				this.notifyAll();
			}
	}
}