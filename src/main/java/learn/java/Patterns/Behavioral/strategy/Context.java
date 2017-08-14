package learn.java.Patterns.Behavioral.strategy;

/**
 * Created by dvorop on 13.06.2017.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
