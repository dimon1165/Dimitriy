package learn.java.Patterns.Structural.decorator;

/**
 * Created by dvorop on 17.07.2017.
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
