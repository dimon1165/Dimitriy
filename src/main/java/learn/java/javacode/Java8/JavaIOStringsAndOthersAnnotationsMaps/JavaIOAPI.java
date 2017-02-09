package learn.java.javacode.Java8.JavaIOStringsAndOthersAnnotationsMaps;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * More info about IO:
 * for reading and writing a bytes from whatever we should use InputStream, OutputStream(which is abstract classes)
 * and for reading char we should use Reader and Writer.
 * The implementations of InputStream ->
 * - ByteArrayInputStream;
 * - PipedInputStream(Producer/Consumer concept);
 * - FileInputStream.
 * The implementations of InputStream ->
 * - ByteArrayOutputStream;
 * - PipedInputStream;
 * -FileOutputStream.
 * The implementations of Reader is:
 * - CharacterArrayReader;
 * - StringReader(allows to work with StringBuffer);
 * - PipedReader;
 * - InputStreamReader;
 * The implementations of Writer is:
 * - CharacterArrayWriter;
 * - StringWriter;
 * - PipedWriter;
 * - OutputStreamWriter(allows to create reader over a inputStream/outputStream)-> FileReader/Writer;
 *
 * How Java 8 IO works
 *
 */
public class JavaIOAPI {
    public static void main(String[] args) {
//        search and open file with java nio
        try(BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("peoples.txt"))){
//            List<String> list = Files.readAllLines("peoples.txt");
            Stream<String> stringStream = bufferedReader.lines();
            stringStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        search and open with java8
        try(BufferedReader bufferedReader =
                    new BufferedReader(
                        new FileReader(
                                new File("peoples.txt" )))
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
        Path path = Paths.get("/");
                try(Stream<Path> stream = Files.list(path)){
                    stream.filter(path1 -> path1.toFile().isFile())
                            .forEach(System.out::println);
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
}
