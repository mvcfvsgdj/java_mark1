package 티켓팅프로그램임시;

public class TicketingMain {

	public static void main(String[] args) {
		String FolderPath = "res/Concert";
	
		String[] FilePath = {
				"res/Concert/sectorA.txt",
				"res/Concert/sectorB.txt",
				"res/Concert/sectorS.txt",
				"res/Concert/sectorV.txt",
		};

		//폴더 자동 생성
		Init.InitFolder(FolderPath);
		for(int i = 0; i<FilePath.length; i++) {
			Init.InitFile(FilePath[i]);
		}
		Concert_Program cp = new Concert_Program();
		
		cp.Concert_Search();
		cp.Concert_Insert();
		cp.Concert_Search();
		
	}

}
