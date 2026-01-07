package threadTest;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) {

		AutoSaveThread thread = new AutoSaveThread();
		
		thread.setDaemon(true);
		thread.start();
		
		System.out.println("메인 스레드 시작");
		
		try {
			Thread.sleep(5000);
			System.out.println("메인 스레드 종료");
			System.out.println("데몬 스레드도 같이 죽어");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
