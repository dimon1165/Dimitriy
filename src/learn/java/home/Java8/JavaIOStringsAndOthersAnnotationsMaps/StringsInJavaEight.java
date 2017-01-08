package learn.java.home.Java8.JavaIOStringsAndOthersAnnotationsMaps;

import java.util.StringJoiner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * What is new in String in Java 8
 */
public class StringsInJavaEight {
    public static void main(String[] args) {
    //Мы можем объеденять Strings методом
        StringJoiner stringJoiner = new StringJoiner(" ","{","}");
        stringJoiner.add("Hello").add("to").add("You").add("World");
        stringJoiner.add("Fun");
        System.out.println(stringJoiner);
    // Можно объеденять Strings статическим методом join:
        String s = String.join(", ","a","b","c");
        System.out.println(s);
    }
}
