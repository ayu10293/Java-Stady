
public class reigai2 {

	public static void main(String[] args) {
		int[] num = {10, 20, 30};
		for(int i = 0; i < 4; i++) {
			try {
				System.out.println("num :" + num[i]);
				System.out.println(" : " + (i+1) + "回目のループ");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("例外を発生しました");
			} finally {
				System.out.println("-- finallyの実行");
			}
		}
		System.out.println("-- end --");
	}
}
