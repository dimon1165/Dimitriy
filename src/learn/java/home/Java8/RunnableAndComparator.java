package learn.java.home.Java8;

import learn.java.home.Threads.NewThread;

/**
 * Как пример для интерфейса Runnable
 */
public class RunnableAndComparator {
    public static void main(String[] args) throws InterruptedException {
        /*
         * Запись без лямбда выражения
         **/

//  Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                int i;
//                for (i = 0; i <= 3; i++) {
//                    System.out.println("Hello world form thread [ " + Thread.currentThread().getName() + " ]");
//                }
//            }
//  };


        /*
        * Запись с лямбда выражением
        * */
        Runnable runnable = () -> {int i;
                for (i = 0; i <= 3; i++) {
                    System.out.println("Hello world form thread [ " + Thread.currentThread().getName() + " ]");
                }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
    }
}
