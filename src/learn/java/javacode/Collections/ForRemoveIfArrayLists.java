package learn.java.javacode.Collections;

import java.util.function.Predicate;

public class ForRemoveIfArrayLists<T> implements Predicate<T> {
	
	T localvariable;
	
	@Override
	public boolean test(T t) {
		if (localvariable.equals(t)) {
			return true;
		}
		return false;
	}

}
