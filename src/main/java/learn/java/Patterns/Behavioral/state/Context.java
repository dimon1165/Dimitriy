package learn.java.Patterns.Behavioral.state;

/**
 * Created by dvorop on 13.06.2017.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
