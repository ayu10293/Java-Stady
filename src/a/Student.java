package a;

public class Student {
	String name;
	int mathScore ;
	int engScore ;
	
	void display() {
		System.out.println(name + "さん");
		System.out.println("英語" + engScore + "点" + "" + "数学" + mathScore + "点");
	}
	void setScore (int math , int eng) {
		mathScore = math;
		engScore = eng;
	}
	double getAvg() {
		double avg = (mathScore + engScore) / 2.0;
		return avg;
	}
}
