package learn.java.Patterns.creational.abstractfactory;

/**
 * Created by dvorop on 15.08.2017.
 */
public class WindowsButton implements Button  {

    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
