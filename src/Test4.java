
public class Test4 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		Test4 obj = new Test4();
		obj.setNum(100);
		System.out.println(obj.getNum());
	}

}
