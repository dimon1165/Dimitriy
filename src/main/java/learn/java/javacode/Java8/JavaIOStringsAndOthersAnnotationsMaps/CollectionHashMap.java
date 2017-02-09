package learn.java.javacode.Java8.JavaIOStringsAndOthersAnnotationsMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In Collection API there are a couple new methods, but the most important new one is:
 * stream() and parallelStream() and also
 * Spliterator - which could split stream or collection just because it needs to be able work in parallel
 */
public class CollectionHashMap {
    public static void main(String[] args) {
        // New method on iteration is forEach
        List<String> stringList = Arrays.asList("one","two","three","four");
        stringList.forEach(System.out::println);

        // New in collections is replaceAll
        stringList.replaceAll(String::toUpperCase);
        System.out.println(
                stringList.stream().collect(Collectors.joining(", ")));

        // New in collections also is sort
        List<String> strings = Arrays.asList("one","two","three","four");
        List<String> list = new ArrayList<>(strings);
        list.replaceAll(String::toUpperCase);
        list.sort(Comparator.naturalOrder());
        System.out.println(
                list.stream().collect(Collectors.joining(", ")));

        //Remove if exists - use removeIf() method
    }
}
