package learn.java.javacode.Collections;

import java.util.HashSet;
import java.util.Set;

/*
 *Set - Sortedset
 *	  -	NavigableSet 
 */

public class HashSetLearn {
	public static void main(String[] args) {
//		не гаратирует поседовательности ввиду использования
//		хеш функции, не допускает повторений
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
