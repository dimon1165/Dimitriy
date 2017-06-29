package learn.java.Patterns.Structural.Proxy;

/**
 * Created by dvorop on 13.06.2017.
 * In proxy pattern, a class represents functionality of another class.
 * This type of design pattern comes under structural pattern.
 * In proxy pattern, we create object having original object to interface its functionality to outer world.
 */
public class ProxyPatternMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
