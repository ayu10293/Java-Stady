class A{
	A(String message){
		System.out.println(message + "from A.");
	}
}
class B extends A{
	B(){
		//super("hello");
		System.out.println("Hello from B.");
	}
}
public class Q6_7 {

	public static void main(String[] args) {
		B b = new B();
	}

}
