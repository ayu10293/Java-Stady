public class Main {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.makesound();
		((Dog) a).play();
	}
}