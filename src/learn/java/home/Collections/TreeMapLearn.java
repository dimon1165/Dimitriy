package learn.java.home.Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLearn {
	public static void main(String[] args) {
		Map<String, Double> map = new TreeMap<>();
		map.put("Dou Jhons", 3434.34);
		map.put("Tom Smith", 123.22);
		map.put("Jein Baiker", 1378.0);
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
	}
}
