package learn.java.Patterns.creational.abstractfactory;

/**
 * Created by dvorop on 15.08.2017.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactoryAbstract factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
