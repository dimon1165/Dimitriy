package learn.java.javacode.Java8.JavaIOStringsAndOthersAnnotationsMaps;

import learn.java.javacode.SupportClasses.People;

import java.util.Comparator;

/**
 * Comparators
 */
public class ComparatorJava8 {
    public static void main(String[] args) {
        //Compare people by age and then by name
        Comparator<People> peopleComparator =
                Comparator.comparing(People::getAge)
                        .thenComparing(People::getName);
        //reversed comparator
        Comparator<People> peopleComparator1 =
                Comparator.comparing(People::getAge)
                        .thenComparing(People::getName).reversed();
        //natural comparator with nullFirts,nullLast methods which  put first null and last null in list
        Comparator<String> stringComparatorFirst = Comparator.nullsFirst(Comparator.naturalOrder());
        Comparator<String> stringComparatorLast = Comparator.nullsLast(Comparator.naturalOrder());
    }
}
