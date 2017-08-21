package learn.java.Patterns.creational.factorymethod;

/**
 * Created by dvorop on 15.08.2017.
 */
public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
