package exa;

public class X5 {
	private short s;//デフォルト値が0
	private Integer i;//デフォルト値がnull

	public X5(int i) {
		this.i = this.i + i + s;
		this.s = 0;
	}

	public void print() {
		System.out.println(" s = " + s + " : i = " + i);
	}

	public static void main(String[] args) {
		X5 obj = new X5(5);
		obj.print();
	}

}
