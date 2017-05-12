package learn.java.javacode.Collections;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArraysLearning {
	
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
	public static void main(String[] args) {
		ForArray forArray = new ForArray();

//		sorting array
		int [] arr1 = {1,3,2};
        Arrays.sort(arr1);
//      fill array
        int [] arr2 = new int[10];
        Arrays.fill(arr2, 0,9,10);
        for (int i : arr2) {
            System.out.println(i);
        }

//Array String
		String array [] = new String [10];
		array[1] = "holla";
		array[2] = new String ("holla 2");
		array[3] = "10";
		System.out.println(Arrays.toString(array));
//		System.out.println(array[1].isEmpty());
//		System.out.println(array[1].substring(1, 3));

//		Transfer Array to ArrayList
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		list.add(0, "Chappy");
		list.add(1, "Chad");
		System.out.println(list.toString());

//		Array with different objects
		Object object [] = {new String("H"), new Integer(10), 11, forArray, "fff"};
		System.out.println(Arrays.toString(object));

//		Ususal Java dont allow delete element from araray
//		but we can do it by using commons.apache.org library:Javadocs
//			object = ArrayUtils.remove(object, 2);
//			System.out.println(Arrays.toString(object));


//		Arrays inside array
		int array2 [] = new int [10];
		int array1 [] = new int [10];
		int array3 [] = new int [10];
//		Object arrayContainer = {array1, array2, array3}; - not work!!
//		Array into an Array - is double array
		int [][] arrayContainer = {array1, array2, array3};
		for(int resultArray [] : arrayContainer){
//			!!!!! returns arrays to string
//			[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//			[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//			[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
			System.out.println(Arrays.toString(resultArray));
		}
	}
}