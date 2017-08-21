package learn.java.Patterns.creational.abstractfactory;

/**
 * Created by dvorop on 15.08.2017.
 */
public class MacOSFactory implements GUIFactoryAbstract {
    @Override
    public MacOSButton createButton() {
        return new MacOSButton();
    }

    @Override
    public MacOSCheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
