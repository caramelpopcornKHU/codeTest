package threadTest;

import java.io.PrintStream;

public class TestRunnable {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		thread.start();
		System.out.println(thread.getName());
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread());
		
		
		
	}

}
