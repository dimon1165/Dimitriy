package learn.java.Patterns.Behavioral.state;

/**
 * Created by dvorop on 13.06.2017.
 */
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
