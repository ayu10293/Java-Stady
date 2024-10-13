import java.util.function.Function;

class dotti implements Function<Integer, Boolean> {
	@Override
	public Boolean apply(Integer i) {
		if (i < 10) {
			System.out.println(i + "は10より小さいよ");
			return true;
		}
		else {
			return false;
		}
	}
}

public class E26 {
	public static void main(String[] args) {
		dotti obj = new dotti();
		boolean result = obj.apply(5);
		System.out.println(result);
	}
}