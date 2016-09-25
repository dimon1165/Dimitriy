package learn.java.home.InterfaceAbstractClasses;

//abstract class could not be final because by definition it is complete
public abstract class AbstractClasss {
	final int k;
	
//	Class can be abstract without any methods being abstract
	public void NonAbstractOne() {}
	public void NonAbstractTwo() {}
	public void NonAbstractThre() {}
	
//	On the other hand, if a class has any abstract methods, 
//	then it must be declared abstract.
//	Abstract methods don't have a body
	public abstract void AbstractOne();
	
//	Abstract class can has constructor	
//	You would define a constructor in an abstract class if you are in one of these situations:
//	1. You want to perform some initialization (to fields of the abstract class) before the instantiation of a subclass actually takes place
//  2. You have defined final fields in the abstract class but you did not initialize them in the declaration itself; 
//	in this case, you MUST have a constructor to initialize these fields
	public AbstractClasss(int k) {
		this.k = k;
	}
	
	
}
