package learn.java.home.InnerNestedClasses;

/**
 *-An instance of InnerClass can exist only within an instance of OuterClass and has direct access to the methods and fields of its enclosing instance.
 * -Variables of inner class is not accessible for outer class.
 * -Nested (static) inner class. Has access only to static elements.
 * -Inner classe also can be final.
 *
 * Types of innner classes:
 * 1. Nested class:
 * -static inner clas
 * Has acces only to static variables.
 * 2. Member inner class:
 * - when we create instance of class which is in antoher location and not inner (Inner inner = new Inner();)
 * in one of the Oter class methods.
 * Has access to all method and fields of outer class.
 * 3. Method-local inner:
 * - both writing inner class in outer and creating instance of inner class in one of the methods of outer class.
 * 4. Anonymous inner class.
 * -add new instance of class to paramether of called method.
 * button.addActionListener(new ActionListener()){...}
 *
 * */

public class InnerClass {
	int innerClassVariable = 10; 
	
	public void InnerClassMethod(){
		System.out.println("Method of InnerClass");
	}
	
//	Inner class
//	An instance of InnerClass can exist only within an instance of OuterClass 
//	and has direct access to the methods and fields of its enclosing instance.
//	Variables of inner class is not accessible for outer class
	public class InnerOne{
		public void InnerOneClassMethod(){
			System.out.println("Method of InnerOneClassMethod use variable: " + innerClassVariable);
		}
	}
	
//	 Nested static inner class. Has access only to static elements
	 static class InnerTwo{
		 public void InnerTwoClassMethod(){
				System.out.println("Method of InnerTwoClassMethod");
			}
	}
	 
//	 Final inner class
	 final class InnerThree{
		 public void InnerThreeClassMethod(){
				System.out.println("Method of InnerThreeClassMethod use variable: "+ innerClassVariable);
			}
	 }
	 
//	 	 MAIN
	 	public static void main(String[] args) {
//	 		General class
	 		InnerClass innerClass = new InnerClass();
	 		innerClass.InnerClassMethod();
	 		
//	 		Calling inner non-static class of general class
//	 		works only through calling general class
	 		InnerClass.InnerOne innerOne = innerClass.new InnerOne(); 
	 		innerOne.InnerOneClassMethod();
	 		
//	 		Calling nested static class
	 		InnerClass.InnerTwo innerTwo = new InnerTwo();
	 		innerTwo.InnerTwoClassMethod();
	 		
//	 		Calling final class
	 		InnerClass.InnerThree innerThree = innerClass.new InnerThree();
	 		innerThree.InnerThreeClassMethod();
	 		
	}
}
 

