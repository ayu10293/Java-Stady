package exa;

class A{
	public void h() {
		System.out.println("hello");
	}
	public void b() {
		System.out.println("byeeeeeeee");
	}
}

class V extends A{
	public void b() {
		System.out.println("bye");
	}
}

public class X100 {
	public static void main(String[] args) {
		A a = new V();
		a.b();
	}
}
