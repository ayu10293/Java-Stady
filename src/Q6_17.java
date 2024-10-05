class Animal2 {
	void saySomething() {
		System.out.print("Gurrr! ");
	}
}
public class Q6_17 extends Animal2 {
	protected void saySomething() {
		System.out.print("Moo! ");
	}
	public static void main(String[] args) {
		Animal2 [] animals = {new Animal2(), new Q6_17()};
		for(Animal2 a : animals) {
			a.saySomething();
		}
	}

}
