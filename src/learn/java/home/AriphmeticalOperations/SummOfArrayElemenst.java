package learn.java.home.AriphmeticalOperations;

	public class SummOfArrayElemenst {
		public static void main(String[] args) {
			int array []  ={1,2,3,4,5,6,7,8,9,10};
			int sum = 0;
			for (int i : array) {
				sum += i; 
				System.out.println(sum);
			}
			System.out.println(sum);
 		}
}
