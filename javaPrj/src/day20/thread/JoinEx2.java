package day20.thread;

public class JoinEx2 {

	public static void main(String[] args) {
			
			
			Thread th = new Thread(new Runnable(){

				@Override
				public void run() {
					for (int i =0 ; i<100*7; i++) {
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(i + "ㅎㅇ");
					}
				}});

			
			th.start();
			try {
				th.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ㅂ2");
		
		}
	}