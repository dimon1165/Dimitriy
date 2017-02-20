package learn.java.javacode.ThreadsMultithreading.Concurrency;

/**
 * Double checked Singleton
 * Created by dvorop on 20.02.2017.
 */
public class Singleton {
    private static Object key = new Object();

    private  static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance != null){
            return instance;
        }
        synchronized(key){
            if (instance != null){
                instance = new Singleton();
            }
            return instance;
        }
    }
}
