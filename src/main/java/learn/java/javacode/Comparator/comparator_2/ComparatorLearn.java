package learn.java.javacode.Comparator.comparator_2;

import java.util.Map;
import java.util.TreeMap;

public class ComparatorLearn {
	public static void main(String[] args) {
//		Сортировка по фамилии(по ключу)
		Map<String, Double> map = new TreeMap<>(new TComp());
		map.put("Dou Jhons", 3434.34);
		map.put("Jeck Jhons", 3434.34);
		map.put("Tom Smith", 123.22);
		map.put("Jein Baiker", 1378.0);
		System.out.println(map.entrySet());
	}
}
