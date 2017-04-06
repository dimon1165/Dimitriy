package learn.java.OCA;
//static import

/**
 * Created by dvorop on 30.03.2017.
 */
public class Experiments {
    String s = this.toString();

    public int forOverride(int x, float y){
        System.out.println("native");
        return x;
    }

    public static void main(String[] args) {
//        static import implementation
        Experiment2.forExm(1,2);
//        Variables casting
        char c = 'a';
        byte b = 1;
        short sho = 1;
        int d = 120;
        long lon = 10L;
        float fg = 10f;
        double dou = 10.0;

//       related to keyword - this
        Experiments experiments = new Experiments();
        System.out.println(experiments.s);


//        null
        String s = null;
        String str = null;

        System.out.println(str);
        String str1 = "g";
        str = str+s;
        System.out.println(str.charAt(1));

        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer =  new StringBuffer();

        String emptyString ="";
        for (int x=0; (x<10) && emptyString.isEmpty();x++){
            emptyString = "a";
            System.out.println("Should be unreachable code but not");
        }
    }
}
