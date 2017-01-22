package learn.java.javacode.Enums;

public class Reflection {
	public void printname(){
		System.out.println(this.getClass().getName());	
	}	
	public static void main(String[] args) {
		new Reflection().getClass().getName();
	}
}
