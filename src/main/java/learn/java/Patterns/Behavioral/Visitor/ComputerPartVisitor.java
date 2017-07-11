package learn.java.Patterns.Behavioral.Visitor;

/**
 * Created by dvorop on 29.06.2017.
 *
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
