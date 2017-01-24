package learn.java.javacode.Recursion;

	class RecursionArray{
		 int valuse [];
		 RecursionArray(int i){
			valuse= new int[i];
		 }
		 
		void recurseIt(int i){
			if(i==1) return ;
			else recurseIt(i-1);
			System.out.println(valuse[i-1]);
		}
	}
	
public class RecursionSecond {
	public static void main(String[] args) {
		RecursionArray recursionArray = new RecursionArray(10);
		for (int i = 0; i < 10; i++) {
			recursionArray.valuse[i] = i;
		}
		recursionArray.recurseIt(10);
	}
}
