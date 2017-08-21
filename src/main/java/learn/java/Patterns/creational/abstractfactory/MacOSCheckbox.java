package learn.java.Patterns.creational.abstractfactory;

/**
 * Created by dvorop on 15.08.2017.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
