package learn.java.home.Static;

/**
 *
 *Static belong to the class.
 * If something is static that means that it is creating only once in memory during class loading.
 * - VARIABLE - if variable is static that means it was created in memory only once and can be use trough class name.
 * It is memory efficient because we can create static var for field wich is the ame for all clases.
 * This variable will be created only once in memory and we shouldnt instantiate it each time.
 * - METHOD - the static method could be invoked without creating instance of class.
 * Static method can access the static data member and can change it.
 * They have two restrictions:
 * 1. Cannot use non-static data or call non-static method directly.
 * 2. Key word this and super cannot be use in static context.
 * - CLASS - if class is nested(inside another class) we can use static word to call it from main class.
 *
 * */

public class First {
	public void NonStatic(){
		System.out.println("NonStatic");
	}
	
//Static variable
	public static int k;
	
//	Static method
	public static void MethodStatic(){
		System.out.println("MethodStatic");
	}
}
