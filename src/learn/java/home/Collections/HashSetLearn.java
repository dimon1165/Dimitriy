package learn.java.home.Collections;

import java.util.HashSet;
import java.util.Set;

/*
 *Set - Sortedset
 *	  -	NavigableSet 
 */

public class HashSetLearn {
	public static void main(String[] args) {
//		не гаратирует по�?лудовательно�?ти ввиду и�?пользовани�? 
//		хеш функции, не допу�?ает повторений
		Set<String> hashSetStrings = new HashSet<>();
		hashSetStrings.add("October");
		hashSetStrings.add("Octoberez");
		hashSetStrings.add("October");
		System.out.println(hashSetStrings);
		
		hashSetStrings.remove("October");
		System.out.println(hashSetStrings);
		
		System.out.println(hashSetStrings.size());
		System.out.println(hashSetStrings.toArray());
	}
}
