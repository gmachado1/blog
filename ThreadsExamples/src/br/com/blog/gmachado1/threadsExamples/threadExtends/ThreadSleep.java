
package br.com.blog.gmachado1.threadsExamples.threadExtends;

public class ThreadSleep extends Thread{
	
	@Override
	public void run(){
		System.out.println("Trabalho importante sendo executado");
		for(int i=0;i<6;i++){
			System.out.println("Thread "+i+" - "+Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("excecao Thread!");
			}
		}
	}

	public void run(String s){//método run que não é considerado na thread
		// a não ser que o metodo run sem paramentro o chame
		System.out.println("Texto sendo executado é :"+s);
	}

}
