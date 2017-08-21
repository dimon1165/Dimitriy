package learn.java.Patterns.creational.factorymethod;

/**
 * Created by dvorop on 15.08.2017.
 */
public class WindowsDialog extends Dialog{

    public Button createButton() {
        return new WindowsButton();
    }
}
