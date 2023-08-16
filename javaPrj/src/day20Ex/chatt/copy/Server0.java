package day20Ex.chatt.copy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0 {

	// 서버소켓
	ServerSocket ss;
	// 클라이언트와 통신하는 소켓
	Socket s;

	DataInputStream dis;
	DataOutputStream dos;

	public Server0() {
		try {
			ss = new ServerSocket(8000);
			// 대기상태에 있다가 client 가 요청이 오면 통신할수 있는 소캣을 생성해 반환함
			System.out.println("server start");
			s = ss.accept();
			System.out.println("client 요청");

			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			// 받기
			dataRecv();

			// 보내기
			dataSend();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void dataRecv() {
		// TODO Auto-generated method stub

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					String message;
					try {
						message = dis.readUTF();
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		t.start();
	}

	private void dataSend() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						System.out.println("메시지");
						String message = sc.nextLine();
						dos.writeUTF(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});
		t.start();
	}

	public static void main(String[] args) {

		Server0 s = new Server0();
	}
}
