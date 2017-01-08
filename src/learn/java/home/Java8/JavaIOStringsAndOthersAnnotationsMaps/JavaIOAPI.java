package learn.java.home.Java8.JavaIOStringsAndOthersAnnotationsMaps;

import java.io.*;

/**
 *
 */
public class JavaIOAPI {
    public static void main(String[] args) {
        try(
                BufferedReader bufferedReader = new BufferedReader(
                        new FileReader((new File("C:\\Users\\Nadya\\projects\\Dimitriy_Study\\peoples.txt"))));
                ){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
