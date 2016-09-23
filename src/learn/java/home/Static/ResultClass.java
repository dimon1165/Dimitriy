package learn.java.home.Static;

public class ResultClass {
	public static void main(String[] args) {

//		First class
		First.MethodStatic();
		First.k = 112;
		
//		With creating instance
		First first = new First();
		first.NonStatic();
		System.out.println(first.k = 10);
		
//		FirstExtender class
		FirstExtender.getStatic();
		FirstExtender.MethodStatic();
		
//		With creating instance
		FirstExtender extender = new FirstExtender();
		extender.NonStatic();
		System.out.println(extender.k = 11);
		extender.getStatic();
		extender.MethodStatic();
	}
}
