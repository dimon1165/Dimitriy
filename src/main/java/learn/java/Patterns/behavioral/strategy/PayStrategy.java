package learn.java.Patterns.behavioral.strategy;

/**
 * Created by dvorop on 15.08.2017.
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
