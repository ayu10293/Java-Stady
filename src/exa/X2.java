package exa;
interface Eng{
	String LANG = "英語";
	void display();
}
public class X2 implements Eng {
	public void display() {
		System.out.println(LANG);
	}
	public static void main(String[] args) {
		X2 ppp = new X2();
		ppp.display();
	}

}
