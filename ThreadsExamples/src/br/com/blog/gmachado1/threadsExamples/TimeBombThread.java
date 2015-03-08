package br.com.blog.gmachado1.threadsExamples;

public class TimeBombThread implements Runnable {
	static String[] timer = { "zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine" };

	public void run() {
		try {
			for (int i = 9; i >= 0; i--) {
				System.out.println(timer[i]);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Thread t1 = new Thread(new TimeBombThread());
		t1.start();
		System.out.println("Boom!");

	}

}