package exa;

public class X3 {

	public static void main(String[] args) {
		try {
			x();
			System.out.print("1 ");
		} catch(RuntimeException ex) {
			System.out.print("2 ");
		}
	}
	static void x() throws RuntimeException{
		if (Math.random() > 0.1) {
			throw new RuntimeException();
		}
		System.out.println("3 ");
	}

}
