package learn.java.javacode.Collections;

/**
 * Created by dvorop on 09.06.2017.
 */
public class Main {

    private static void print(Object obj){
        System.out.println("Object");
    }

    private static void print(String str) {
        System.out.println("String");
    }

    public static void main(String[] args) {
        Object obj = new String("retye");
        print(obj);
    }
}

