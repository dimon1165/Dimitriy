package learn.java.javacode.ThreadsMultithreading.MultyThreading;

public class CurrentClassDemo {
	public static void main(String[] args) {
//		показать существующий главный поток
		Thread thread = Thread.currentThread();		
		System.out.println(thread);
		
//		получить имя,приоритет и id потока
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getId());
		
//		задать имя потоку
		thread.setName("My thread");
		System.out.println(thread);
		
		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println(i);
//				поток засыпает на 1 сек в каждой итерайции
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
