package learn.java.Patterns.structural.decorator;

/**
 * Created by dvorop on 17.07.2017.
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
