package learn.java.home.ParametersTransfer;


class PassObjectRead{
	int a;
	int b;
	
	public PassObjectRead(int i, int j) {
		a = i;
		b = j;
	}
	
//	Transfer object
	void math(PassObjectRead passObjectRead){
		passObjectRead.a *= 2;
		passObjectRead.b *= 2;
	}
	
}

public class ParametersTransfer {
	public static void main(String[] args) {
		PassObjectRead objectRead = new PassObjectRead(15, 20);
		System.out.println("a, b before calling: " + objectRead.a+ " "+ objectRead.b);
		
		objectRead.math(objectRead);
		
		System.out.println("after: " + objectRead.a+ " "+ objectRead.b);
	}
}
