package day20.thread;

import java.util.Iterator;

public class JoinEx {

	public static void main(String[] args) {
		
		
		Thread th = new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i =0 ; i<100; i++) {
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

