package day20.thread;

public class SleepEx {
	public static void main(String[] args) {

		SThread th1 = new SThread();
		SThread2 th2 = new SThread2();
		th1.start();
		th2.start();

	}
}

////
class SThread extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 1032821; i++) {
			try {
				sleep(20);
				System.out.println((i + 1) + "ㅂㅇ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
////

class SThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 153530; i++) {
			try {
				sleep(10);
				System.out.println((i + 1) + "ㅎㅇ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}