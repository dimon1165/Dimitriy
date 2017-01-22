package learn.java.javacode.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorListIterator {
	public static void main(String[] args) {
		List<String> listString = new ArrayList<>();
		listString.add("C");
		listString.add("A");
		listString.add("E");
		listString.add("B");
		listString.add("D");
		listString.add("F");
//		Ususal iterator
		Iterator<String> iterator = listString.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println(element + listString.indexOf(element));
		}
		
//		ListIterator for both side
		ListIterator<String> iterator2 = listString.listIterator();
		while (iterator2.hasPrevious()) {
			String element = iterator2.next();
			System.out.println(element + listString.indexOf(element));
			
		}
	}
}
