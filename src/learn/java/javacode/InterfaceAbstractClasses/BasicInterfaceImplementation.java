package learn.java.javacode.InterfaceAbstractClasses;

public class BasicInterfaceImplementation implements BasicInterface, BasicInterface.InnerInterface {
	
//	We have to override all methods in interface abstract and inner interfaces methods as well
	@Override
	public void InterfacesMethodOne(int i, int k, String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InterfacesMethodTwo(int i, int k, String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InterfacesAbstractMethodOne() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void InnerInterfaceMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InnerInterfaceAbstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
//		We can call method with help of Interface name
		BasicInterface.staticMethodInInterface();
		
//		We can call inner class of interface 
		BasicInterface.ClassInside classInside = new ClassInside();
		classInside.InterfaceInnerClassMethod();
	}

}
