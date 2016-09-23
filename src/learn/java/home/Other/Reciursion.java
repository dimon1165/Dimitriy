package learn.java.home.Other;

class Factorial{
	int factorial(int n){
		int result;
		
		if(n==1) return 1;
		result = factorial(n-1)*n;
		System.out.println(result);
		return result;
	}
}

public class Reciursion {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		int finalResult = factorial.factorial(15);
		System.out.println("Factorila is: "+finalResult);
	}
}
