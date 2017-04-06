package learn.java.OCA;

/**
 * Created by dvorop on 05.04.2017.
 */
public interface General {
    int i=0;
    void m();
}

    class NonInterface implements General {
         int i = 150;

        @Override
        public void m() {
             int i = 300;
        }
    }
        class NonIn2 extends NonInterface {
             int i = 100;

             public void m(){
                int i = 400;
                System.out.println(i);
            }

            public static void main(String[] args) {
                 int s=1;
                 int i=1;
                if (s > 0)
                    System.out.println();
                 else
                    System.out.println();
            }
        }

