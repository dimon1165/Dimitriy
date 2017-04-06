package learn.java.OCA;

/**
 * Created by dvorop on 31.03.2017.
 */
public class Experiment2 {
    Integer imn = 1;
//    casting vargargs to  object
     static public void forExm(Object ... variables){
        String result = String.format("Frist var is:%s and the Second is:%s",variables);
        System.out.println(result);
        System.out.println(variables[0]+"   "+variables[1]);
    }

    public static void main(String[] args) {
        Experiment2 experiment =  new Experiment2();
        experiment.forExm("1","2");

//        arrays filled with default values in the initialzation
        boolean [] array =  new boolean[2];
        System.out.println(array[1]);

//      multidimensional arrays
//                            [0]             [1]
        char[][] arry = {{'c','u','p'},{'j','a','v','a'}};
//                        [0] [1] [2] , [0] [1] [2] [3]
        System.out.println(arry[0][0]);
        System.out.println(arry[1][2]);
//        ++ --
        int k = 1;
        int n = 1;

        System.out.println(++k - k++);
        System.out.println(k);

        System.out.println("Increment after print: "+ k++);
        System.out.println("Increment before print: "+ ++n);

    }
}
