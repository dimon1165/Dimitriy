package learn.java.home.VariableLengthArguments;

public class VariableArguments {
	
//	we can overload vargargs methods
	static void vaTest(String message, int...v){
		System.out.println(message+ v.length+ "Entity: ");
		for (int x : v) {
			System.out.println(x+ "");
		}
	}
	
	public static void main(String[] args) {
		vaTest("One parameter varargs", 10);
		vaTest("Three parameter varargs", 10,11,12);
		vaTest("WITHOUT parameter varargs");
	}
}
