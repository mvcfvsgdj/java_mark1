package day20.thread;

public class Ex1 {

	public static void main(String[] args) {

		R r = new R();
		Thread t = new Thread(r);
//		Thread t = new Thread(new R());
		t.start();

		for (int i = 0; i < 100; i++)
			System.out.println((i + 1) + "ㅎㅇ");
	}
}

class R implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println((i + 1) + "ㅂㅇ");

	}

}
