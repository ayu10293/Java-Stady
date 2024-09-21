package a;

public class Main {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "菅原";
		stu1.setScore(98, 75);
		stu1.display();
		System.out.println("平均" + stu1.getAvg() + "点");
	}

}
