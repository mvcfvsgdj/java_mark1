package day20.thread;

public class InterruptEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx th = new ThreadEx();
		th.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupt(); // interrupt 발생
		System.out.println("ㅅㄱ");
	}

}

//////////////////////////////////////////////

class ThreadEx extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("울팀뭐함");
				return;
			}
			System.out.println((i + 1) + "ㅎㅇ");
			if(isInterrupted()) {
			  System.out.println("성공?");
			  return;
			  }
			}
		}
	}
