package learn.java.javacode.Java8.Lambda;

/**
 * Как пример для интерфейса Runnable
 *
 * Мы можем использовать старую запись Lambda expressions:
 * Consumer<String> c = s -> System.out.println(s);
 * или новую:
 * Consumer<String> c = System.out::println;
 * Еще один пример:
 * Comparator<Integer> c = (i1, i2) -> Integer.compare(i1, i2);
 * Comparator<Integer> c = Integer::compare;
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
