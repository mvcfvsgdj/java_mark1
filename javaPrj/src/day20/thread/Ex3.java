package day20.thread;

public class Ex3 {

	public static void main(String[] args) {

		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
	
	}
}

// 수행 할 코드를 작성
// void run()
class Thread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println((i + 1) + "ㅎㅇ");

	}
	
}

class Thread2 extends Thread{
@Override

public void run() {
	for (int i = 0; i < 100; i++)
		System.out.println((i + 1) + "ㅂㅇ");
}

}