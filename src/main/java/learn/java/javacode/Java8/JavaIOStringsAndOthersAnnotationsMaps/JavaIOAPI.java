package learn.java.javacode.Java8.JavaIOStringsAndOthersAnnotationsMaps;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * How Java 8 IO works
 */
public class JavaIOAPI {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader =
                    new BufferedReader(
                        new FileReader(
                                new File("/Users/Voropai_Dmytro/git/LearningJava/src/" +
                                        "learn/java/javacode/Java8/JavaIOStringsAndOthersAnnotationsMaps/peoples.txt")))
        ){
            Stream<String> stream = bufferedReader.lines();
            stream.filter(line -> line.contains("Amy"))
                    .findFirst()
                    .ifPresent(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Мы можем исследовать файловую систему с методом Path:
        //isDirectory возвращает path к файлу и какие в нем директории
        //isFile возвращает path к файлу и файлы внутри
        Path path = Paths.get("/Users/Voropai_Dmytro/git/LearningJava/src/" +
                "learn/java/javacode/Java8/JavaIOStringsAndOthersAnnotationsMaps/");
                try(Stream<Path> stream = Files.list(path)){
                    stream.filter(path1 -> path1.toFile().isFile())
                            .forEach(System.out::println);
                } catch (IOException e) {
                    e.printStackTrace();
                }

    }
}
