package exa;

public class X100 {
void methodA() throws Exception {}
void methodB() throws RuntimeException{}
	public static void main(String[] args) throws Exception{
		X100 obj = new X100();
		obj.methodA();
		obj.methodB();
	}
}
