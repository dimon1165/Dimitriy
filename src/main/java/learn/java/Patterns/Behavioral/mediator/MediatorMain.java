package learn.java.Patterns.Behavioral.mediator;

/**
 * Created by dvorop on 12.06.2017.
 */
public class MediatorMain {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
