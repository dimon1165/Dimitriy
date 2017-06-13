package learn.java.Patterns.Behavioral.state;

/**
 * Created by dvorop on 13.06.2017.
 * In State pattern a class behavior changes based on its state.
 * This type of design pattern comes under behavior pattern.
 * In State pattern, we create objects which represent various states and a context object
 * whose behavior varies as its state object changes.
 */
public class StatePatternMain {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
