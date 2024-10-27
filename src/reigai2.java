
public class reigai2 {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30 };
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println("num:" + num[i]);
			}

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("例外が発生しました。");
			}
		}
		System.out.println("---end---");
	}
}
