package learn.java.javacode.ForTests;

class Myrunnable implements Runnable{

	
	public void run() {
	System.out.println("Runnable");
		
	}
	
}
public class Test extends Thread{
	public Test(){
		super();
	}
	public Test(Runnable target){
		super(target);
	}
	public void run(){
		System.out.println("Thread");
	}
	public static void main(String[] args) {
		new Test().start();
		new Test(new Myrunnable()).start();
	}
}

