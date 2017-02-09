package learn.java.javacode.ThreadsMultithreading;

public class NewThread implements Runnable {
	Thread thread;
	
	public NewThread() {
//		новый поток исполнения 
		thread = new Thread(this, "Demo thread");
		System.out.println("Inherited trhread was created" + thread);
		thread.start();
	} 
	
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Inherited thread " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of inherited thread");
	}
	
}
