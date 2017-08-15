package learn.java.Patterns.Structural.flyweight;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by dvorop on 14.08.2017.
 */
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
