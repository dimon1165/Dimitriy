package learn.java.Patterns.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dvorop on 14.08.2017.
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
