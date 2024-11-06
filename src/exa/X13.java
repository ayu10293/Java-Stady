package exa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class X13 {
	static Map<Integer, String> map = null;
	static List<Integer> keys = null;
	static String[] values = null;
	static {
		map = new HashMap<>();
		keys = new ArrayList<>(List.of(10, 20, 30));
		values = new String[] {"red", "pink", "blue"};
	}
	X13(){
		for(int i = 0; i < keys.size(); i++) {
			map.put(keys.get(i), values[i]);
		}
	}
	public static void main(String[] args) {
		X13 obj = new X13();
		System.out.print(map.size() + " ");
		obj = null;
		map.clear();
		keys.clear();
		values = new String[0];
		System.out.print(map.size() + " " + keys.size() + " " + values.length);
	}

}
