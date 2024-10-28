package exa;

class P {
	public void strToNum(String s) throws NumberFormatException {
		System.out.println("P : " + Integer.parseInt(s));
	}
}

class C extends P {
	public void strToNum(String s) throws Exception {
		System.out.println("C : " + Integer.parseInt(s));
	}
}

public class X7 {
	public static void main(String[] args) {
		P p = new C();
		p.strToNum("a");
	}

}
