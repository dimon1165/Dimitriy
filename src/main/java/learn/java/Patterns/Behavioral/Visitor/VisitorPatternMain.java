package learn.java.Patterns.Behavioral.Visitor;

/**
 * Created by dvorop on 29.06.2017.
 * In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class.
 * By this way, execution algorithm of element can vary as and when visitor varies.
 * This pattern comes under behavior pattern category. As per the pattern, element object has to accept the visitor
 * object so that visitor object handles the operation on the element object.
 */
public class VisitorPatternMain {
    public static void main(String[] args) {
        ComputePart computePart =  new Computer();
        computePart.accept(new ComputerPartDisplayVisitor());
    }
}
