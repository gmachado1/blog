package br.com.blog.gmachado1.threadsExamples;

public class ThreadA {
	public static void main(String[] args){
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b){
			try{
				System.out.println("Esperando a thread b finalizar!!");
				b.wait();
			}catch(InterruptedException e){
				
			}
			System.out.println("Total = "+b.total);
		}
	}
}

class ThreadB extends Thread{
	int total;
	public void run(){
		synchronized(this){
			for(int i=0;i<100;i++){
				total+=i;
			}
			notify();
		}
	}
}