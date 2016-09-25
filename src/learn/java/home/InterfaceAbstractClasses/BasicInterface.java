package learn.java.home.InterfaceAbstractClasses;

/*
 * If we have to interfaces with same methods name
 * compiler will think about method as it is the same one  
 * But if everything will be equals only returning type will be
 * different it will cause to compilation problem 
 * 
 * Interface can extend another interface
 */

public interface BasicInterface {

//  We can put variables in interface
//	but they automatically become static final
//	static final	 int k= 100;
	 int k=100; 
	
//  Like in abstract method in interface does not contain a body
//  We can only initialize list of transfered parameters (int i, int k, String s)
	 public void InterfacesMethodOne(int i, int k, String s);
	 public void InterfacesMethodTwo(int i, int k, String s);

//  Interface can contain abstract methods
	 abstract void InterfacesAbstractMethodOne();
	 
//  From Java 8 we can put static method in interface
	 static void staticMethodInInterface(){
		 System.out.println("staticMethodInInterface");
	 }
	 
//	 In purpose to indicate non-obvious methods in interface - the methods 
//	 which will be used according the situation but not always. Default methods
	 default String getString(){
		return "String Object";
	 }
	 
//	We can create class inside interface as well as static classes 
//	but all clients of class will have access to class
	 class ClassInside{
		 public void  InterfaceInnerClassMethod(){
			 System.out.println("InterfaceInnerClassMethod");
		 }
	 }
	 
//	 InnerInterface could be private, public, proteted
	 public interface InnerInterface{
		 public void InnerInterfaceMethod();
		 abstract void InnerInterfaceAbstractMethod();
	 }
}
