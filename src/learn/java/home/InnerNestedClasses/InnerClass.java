package learn.java.home.InnerNestedClasses;

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
 

