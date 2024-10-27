package exa;

public class X4 {//7-6

	public static void main(String[] args) throws Exception {
		x();
		System.out.println("1 ");
	}

	static void x() throws Exception {
		if (Math.random() > 0.1) {
			throw new Exception();
		}
		System.out.println("2 ");
	}
}