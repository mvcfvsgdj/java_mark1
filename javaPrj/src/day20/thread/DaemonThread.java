package day20.thread;

public class DaemonThread {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				
				for (int i = 0; i < 100; i++) {
					try {
						Thread.sleep(10);
						System.out.println(i + "ㅎㅇ");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				
			}});
		
		th.setDaemon(true);
		th.start();
		
		
		System.out.println("ㅂ2");

	}

}
