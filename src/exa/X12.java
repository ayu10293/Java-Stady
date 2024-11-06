package exa;

class Parent {
	String name = "A";

	void print() {
		System.out.println(name);
	}
}

class Child extends Parent {
	String name = "B";

	void print() {
		System.out.println(name);
	}
}

public class X12 {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.print();
		System.out.println(obj.name);
	}
}
