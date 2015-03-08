package br.com.blog.gmachado1.threadsExamples;

public class DeadLockRisk {

	private static class Resource {
		public int value;
	}

	private Resource rA = new Resource();
	private Resource rB = new Resource();

	public int read() {
		synchronized (rA) {
			synchronized (rB) {
				return rA.value + rB.value;
			}

		}
	}

	public void write(int a, int b) {
		synchronized (rB) {
			synchronized (rA) {
				rA.value = a;
				rB.value = b;
			}
		}
	}
}
