package threadTest;

import java.awt.Toolkit;

public class Task implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}

		}
	}

}
