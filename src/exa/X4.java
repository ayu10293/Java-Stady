package exa;

public class X4 {

	public static void main(String[] args) throws Exception{
		x();
		System.out.println("1 ");
	}
	static void x() throws Exception{
		y();
	}
	static void y() throws Exception{
		throw new Exception();//エラーを意図的に発生させる
	}
}
