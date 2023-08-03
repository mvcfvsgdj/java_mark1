package 김민규실기평가;

public class Score {

	
	String name;
	int kor;
	int eng;
	
	
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}


	
    public String calcGrade() {
        int sum = kor + eng;
        int avg = sum / 2;

        if (avg >= 90)
            return "A";
        else if (avg >= 80)
            return "B";
        else if (avg >= 70)
            return "C";
        else
            return "F";
    }

    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + calcGrade() + "]";
    }
}