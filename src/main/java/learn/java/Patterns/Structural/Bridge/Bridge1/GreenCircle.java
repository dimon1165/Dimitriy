package learn.java.Patterns.Structural.Bridge.Bridge1;

/**
 * Created by dvorop on 13.06.2017.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
