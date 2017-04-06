package learn.java.OCA;

/**
 * Created by dvorop on 06.04.2017.
 */
public class Wrappers {
    public static void main(String[] args) {
//        Boolean
        Boolean b1 = new Boolean("no");
        System.out.println(b1);
        Boolean b2 = new Boolean("1");
        System.out.println(b2);
        Boolean b3 = new Boolean("TrUe");
        System.out.println(b3);
        Boolean b4 = new Boolean("null");
        System.out.println(b4);
        Boolean b5 = new Boolean(null);
        System.out.println(b4);
        System.out.println(new Boolean(true) == Boolean.TRUE);
//        Integer
        Integer integer1 = new Integer("123");
        System.out.println(integer1);
        Integer integer2 = new Integer(12);
        System.out.println(integer2);
        Integer num = null;
        System.out.println(num+1);//to string convert null as string here
    }
}
