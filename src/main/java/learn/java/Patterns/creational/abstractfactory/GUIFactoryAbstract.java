package learn.java.Patterns.creational.abstractfactory;

/**
 * Created by dvorop on 15.08.2017.
 */
public interface GUIFactoryAbstract {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
