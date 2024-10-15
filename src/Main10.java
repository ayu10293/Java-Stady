import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main10 {
	public static void main(String[] args) {
		List<integer>data =
				new ArrayList<>(Arrays.asList(1,2,3,4,5));
		data.removeif((Integer i) -> {return i % 2 != 0;} );
		System.out.println(data);
	}

}
