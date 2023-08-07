package day15.인터페이스;

public class MinGyu implements MyRunnable {

	@Override
	public void run() {
		
	    String meal [] = {"굶는다", "라멘", "청기와", "중식", "우동"};

	    int index = (int) (Math.random() * meal.length);
	    String randomMeal = meal[index];

	    System.out.println("오늘 밥: " + randomMeal);
	}

	
}
