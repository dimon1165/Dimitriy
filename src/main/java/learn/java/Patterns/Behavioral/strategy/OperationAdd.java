package learn.java.Patterns.Behavioral.strategy;

/**
 * Created by dvorop on 13.06.2017.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
