package learn.java.Patterns.behavioral.state;

public class StatePatternMain {
    public static void main(String[] args) {
       Player player = new Player();
       GUI gui = new GUI(player);
       gui.init();
    }
}
