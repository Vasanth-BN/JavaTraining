package vasanth;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_HashTable {
	public static void main(String... arg) {
		Map<Integer, String> map = new HashMap<>();
		map.put(828, "Vasanth");
		map.put(829, "Jawahar");
		map.put(824, "Abdur");
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println(map.keySet());
		System.out.println(map);
	}
}
