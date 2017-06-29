package learn.java.Patterns.Behavioral.Visitor;

/**
 * Created by dvorop on 29.06.2017.
 */
public class Mouse implements ComputePart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
