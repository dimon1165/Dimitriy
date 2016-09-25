package learn.java.home.InterfaceAbstractClasses;

public class AbstractClassExtender extends AbstractClasss {

//	 As there is no default (or no-arg) constructor in the parent abstract class 
//	the constructor used in subclasses must be specified.
	public AbstractClassExtender(int k) {
		super(k);
		// TODO Auto-generated constructor stub
	}

	public void first(){
		System.out.println("WithoutMethodsAbstractClassExtender");
	}

//	We have to override all abstract methods from superclass or
//	change class to abstract
	@Override
	public void AbstractOne() {}
	
	
//  You are not creating the instance of your abstract class here. 
//	Rather you are creating an instance of an anonymous subclass of your abstract class. 
//	And then you are invoking the method on your abstract class reference pointing to subclass object.
	public static void main(String[] args) {
		AbstractClasss abstractClasss = new AbstractClasss(10) {		
			@Override
			public void AbstractOne() {
				// TODO Auto-generated method stub
			}
		};  
		abstractClasss.AbstractOne();
	}
	
}
