package learn.java.Patterns.Structural.Bridge.Bridge1;

/**
 * Created by dvorop on 13.06.2017.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
