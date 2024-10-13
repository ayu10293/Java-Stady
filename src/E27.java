import java.util.function.Function;
class Foon implements Function<String, String>{
	public String apply(String s) {
		return "今日の寝言は" + s;
	}
}
public class E27{
	public static void main(String[] args) {
		Foon obj = new Foon();
		String ppp = obj.apply("ふうううん");
		System.out.println(ppp);
	}
}