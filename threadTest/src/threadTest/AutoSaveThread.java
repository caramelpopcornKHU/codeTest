package threadTest;

public class AutoSaveThread extends Thread{

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("자동 저장 실행됨");
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	

}
