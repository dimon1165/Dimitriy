package learn.java.javacode.ThreadsMultithreading.Concurrency;

/**
 * Created by dvorop on 20.02.2017.
 */
public class CheckRunnablemethod {
    public static void main(String[] args) throws InterruptedException {
//        initialize task and make it best to stop
        Runnable task = ()->{
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("I am working " + Thread.currentThread().getName());
            }
        };
//        make thread and transfer the task there/ start/ interrupt
        Thread thread= new Thread(task);
        thread.start();
//        only in purpose to run and wait
        thread.sleep(1000);
//        stop thread
        thread.interrupt();
//        indication of ending the operation
        System.out.println("Finish execution");
    }
}
