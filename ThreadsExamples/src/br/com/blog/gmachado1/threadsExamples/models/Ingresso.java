package br.com.blog.gmachado1.threadsExamples.models;

public class Ingresso{
	private int ingressos = 60;

	
	public int getIngressos() {
		return ingressos;
	}

	public void setIngressos(int ingressos) {
		this.ingressos = ingressos;
	}

	public void comprarIngressos(int i) {
		this.ingressos -=i ;
	}
}
