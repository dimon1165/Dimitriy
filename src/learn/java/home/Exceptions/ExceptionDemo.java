package learn.java.home.Exceptions;

public class ExceptionDemo {
	static void demoException(){
		try {
			throw new NullPointerException("ForDemo");
		} catch (NullPointerException e) {
			System.out.println("Exception cacthed in "
					+ "body of method demoException");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			demoException();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Catch again");
		}
	}
}
