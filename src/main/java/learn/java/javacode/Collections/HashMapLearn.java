package learn.java.javacode.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearn {
	public static void main(String[] args) {
		Map<String, Double> hashMap = new HashMap<>();
		hashMap.put("Dou Jhons", 3434.34);
		hashMap.put("Tom Smith", 123.22);
		hashMap.put("Jein Baiker", 1378.0);
		
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.size());
		System.out.println(hashMap.values());
		System.out.println(hashMap.get("Dou Jhons"));
		
//		Show key values
		System.out.println(hashMap.entrySet());
//		or
		Set<Map.Entry<String, Double>> setFromHashMap = hashMap.entrySet();
		for(Map.Entry<String, Double> my : setFromHashMap){
			System.out.println(my.getKey());
			System.out.println(my.getValue());
		}
	}
}
