package learn.java.Patterns.Behavioral.Visitor;

/**
 * Created by dvorop on 29.06.2017.
 */
public interface ComputePart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
