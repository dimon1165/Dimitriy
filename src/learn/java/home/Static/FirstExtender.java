package learn.java.home.Static;

public class FirstExtender extends First{	

//	The only difference with inherited static 
//	(class) methods and inherited non-static (instance) methods is that 
//	when you write a new static method with the same signature, 
//	the old static method is just hidden, not overridden.
	
	static void getStatic(){
		First.k =10; 
		First.MethodStatic();
		MethodStatic();
		getStatic();
	}
	public static void MethodStatic(){
		System.out.println("MethodStatic 2");
	}
	
	static{
		k = 15;
		MethodStatic();
		getStatic();
	}
}
