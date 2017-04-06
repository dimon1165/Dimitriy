package learn.java.OCA;

/**
 * Created by dvorop on 05.04.2017.
 */
public class Experiment3 {
    public int i = 10;
    void n(){

    }
}

    class Experiment4 extends Experiment3{
        public int i = 20;

        public static void main(String[] args) {
            int i = 30;
            System.out.println(i);
            Experiment4 experiment4 = new Experiment4();
            System.out.println(experiment4.i);
            Experiment3 experiment3=  new Experiment3();
            System.out.println(experiment3.i);
        }
    }
