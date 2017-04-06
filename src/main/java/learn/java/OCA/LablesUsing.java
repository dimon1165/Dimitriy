package learn.java.OCA;

/**
 * Created by dvorop on 05.04.2017.
 */
public class LablesUsing {
    public static void main(String[] args) {
        first:
        for (int j = 1; j < 10; j++) {
            System.out.println(j);
        }
        second:for (int i=1; i<10; i++){
            System.out.println(i);
            if (i>3){
              break second;
             }
        }
    }
}
