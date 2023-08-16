package day20.thread;

public class AutoSaveEx {

	public static void main(String[] args) {

		AutoSave s = new AutoSave();
		//s.setDaemon(true);
		s.start();
		
		for(int i=1 ; i<=10 ; i++) {
			
			System.out.println("작업진행");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("작업종료"); 
		
	}
}

/////////////////////////////////////////
class AutoSave extends Thread {
	void autoSave() {
		System.out.println("NOT SAVE GO CRY");
	}
	@Override
	public void run() {

		while(true) {
			try {
				sleep(100);
				autoSave();
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
			
		}
		
	}
}