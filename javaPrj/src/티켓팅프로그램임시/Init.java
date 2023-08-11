package 티켓팅프로그램임시;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Init {
	//폴더 생성 매서드
	public static void InitFolder(String Path) {
		File directory = new File(Path);
		if (!directory.exists()) {
			boolean result = directory.mkdirs(); // 폴더 생성 시도
			if (result) {
				System.out.println("폴더가 생성되었습니다.");
			} else {
				System.out.println("폴더 생성에 실패했습니다.");
			}
		} else {
			System.out.println("이미 폴더가 존재합니다.");
		}
	}

	//파일 생성 매서드
	public static void InitFile(String Path) {
		try {
			File file = new File(Path);
			boolean result = file.createNewFile();
			if (result) {
				System.out.println("파일 생성 성공");

				FileWriter w = new FileWriter(file);
				for (int i = 0; i < 49; i++) {
					w.write("x.");
				}
				w.write("x");
				w.flush();
			} else {
				System.out.println("파일이 이미 존재합니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
