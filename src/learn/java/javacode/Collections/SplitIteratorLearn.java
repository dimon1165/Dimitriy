package learn.java.javacode.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorLearn {
	public static void main(String[] args) {
		List<Double> stringslist = new ArrayList<>();
		double k = 1.0;
		for (int i = 0; i< 200_000; i++){
			stringslist.add(k++);
		} 
		Spliterator<Double> spliterator = stringslist.spliterator();
		while(spliterator.tryAdvance((n)-> System.out.println(n)));
	}
}
