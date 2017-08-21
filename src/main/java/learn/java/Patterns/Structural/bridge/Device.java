package learn.java.Patterns.structural.bridge;

/**
 * Created by dvorop on 11.07.2017.
 */
public interface Device {
    public boolean isEnabled();

    public void enable();

    public void disable();

    public int getVolume();

    public void setVolume(int percent);

    public int getChannel();

    public void setChannel(int channel);

    public void printStatus();
}
