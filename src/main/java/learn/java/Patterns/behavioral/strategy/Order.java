package learn.java.Patterns.behavioral.strategy;

/**
 * Created by dvorop on 15.08.2017.
 */
public class Order {
    private static int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Здесь мы могли бы забрать и сохранить платежные данные из стратегии.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public static int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
