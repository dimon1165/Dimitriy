package learn.java.home.Java8.Streams;

import learn.java.home.SupportClasses.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * map() operation возвращает Stream, и берет Function interface
 *
 */
public class MappingFlatMappingOperation {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,6);
        List<Integer> list3 = Arrays.asList(3,5,7);
        List<List<Integer>> lists = Arrays.asList(list1,list2,list3);
        //Map
        Function<List<?>, Integer> size = List::size;
        lists.stream()
                .map(size)
                .forEach(System.out::println);

        //FlatMap
        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();
        lists.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);
    }
}
