package day15.듀오;
public class DuoProgram { 
	
	MyRunnable mr;
	
	public void alpha (MyRunnable mr) {

		this.mr = mr;
		
		
	}
	public void run() {
		mr.run();
		
		
	}
	public static void main(String[] args) {
		System.out.println("ㄱㄱ혓");
		DuoProgram duo = new DuoProgram();
		MinGyu mg = new MinGyu();
		
		duo.alpha(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("익게왜됨?");
				
			}
			
		});
		duo.run();
		mg.run();
	}
	
	
	
	}

