package learn.java.home.FinalWord;
/**
 * Final is only about reference itself but not about the contents of the referenced object.
 * Final for primitives like(int,char,double..) ensures that value can not be changed.
 * Final for the reference to objects - it is ensures that reference will never change,
 * meaning that it will always refer to the same object.
 * - final for variable - If you make any variable as final, you cannot change the value of final variable
 * (It will be constant)./The process is that compiler make sure that you initialize variable only once.
 * - final for method - If you make any method as final, you cannot override it.
 * - final for class - If you make any class as final, you cannot extend it.
 * - final in method parameter - If you declare any parameter as final, you cannot change the value of it.
 * - final on constructor - it is impossible because constructor is never inherited.
 * Is final method inherited? - Yes, final method is inherited but you cannot override it.
 * Can we initialize blank final variable? - it is useful. We can do such things only in constructor.
 * - static blank final variable - can be initializen only in static block.
 *
 * */
public class Finnnalle {
	
//	variable final
	final int JUST_FOR_TEST = 100;
//	method with final
	final void mart(){
		System.out.println("Final method in job");
	}
}
