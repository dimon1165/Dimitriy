package learn.java.javacode.ThreadsMultithreading.MultyThreading;


/*
*  Thread have the ability to create another thread and those can launch another.
*  Because the threads can execute at the same time we have concurrency.
*  But in some instances a thread could die with main thread left unfinished, so we need to be sure that
*  main thread will wait while all threads will finish.
*  Enables more complete usage of CPU. Allows things to run in parallel.
*  Each thread are responsible on the exception thrown inside of it.
* */
public class ThreadDemo {
	public static void main(String[] args) {
		new NewThread();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main thread " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of main thread");
	}
}
