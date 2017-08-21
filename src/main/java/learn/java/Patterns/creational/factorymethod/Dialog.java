package learn.java.Patterns.creational.factorymethod;

/**
 * Created by dvorop on 15.08.2017.
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    abstract Button createButton();
}
