package learn.java.Patterns.behavioral.visitor;

/**
 * Created by dvorop on 29.06.2017.
 */
public class Computer implements ComputePart {

    ComputePart[] parts;

    public Computer() {
        parts = new ComputePart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i=0; i<parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
