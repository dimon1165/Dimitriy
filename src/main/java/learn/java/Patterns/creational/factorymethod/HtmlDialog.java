package learn.java.Patterns.creational.factorymethod;

/**
 * Created by dvorop on 15.08.2017.
 */
public class HtmlDialog extends Dialog {
    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
