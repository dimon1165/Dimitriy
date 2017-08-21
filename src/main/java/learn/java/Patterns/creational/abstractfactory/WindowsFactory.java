package learn.java.Patterns.creational.abstractfactory;

/**
 * Created by dvorop on 15.08.2017.
 */
public class WindowsFactory implements GUIFactoryAbstract{
    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
