package learn.java.Patterns.Structural.composite;

import java.awt.*;

/**
 * Created by dvorop on 14.08.2017.
 */
public interface Shape {
    public int getX();
    public int getY();
    public int getWidth();
    public int getHeight();
    public void move(int x, int y);
    public Boolean isInsideBounds(int x, int y);
    public void select();
    public void unSelect();
    public Boolean isSelected();
    public void paint(Graphics graphics);
}
