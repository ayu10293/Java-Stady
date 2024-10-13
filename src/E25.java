import java.util.function.Function;

class MyFunc implements Function<String, String>{
	public String apply(String s) {
		return "Hello " + s;
	}
}
public class E25 {

	public static void main(String[] args) {
		MyFunc obj = new MyFunc();
		String st = obj.apply("tanaka");
		System.out.println(st);
	}

}
