package learn.java.home.Enums;

import learn.java.home.Enums.EnumDemo.Apple;

public class EnumImpl {

	public static void main(String[] args) {
//		Example 1 
		String winesap;
		String john;

//		Return position of element starting from 0
		int cortland;
		cortland = Apple.CORTLAND.ordinal();

//		Class<Apple> cortland;
//		cortland = Apple.CORTLAND.getDeclaringClass();
		
//		Return elemnent of enum
		winesap = Apple.WINESAP.GetURL();
		john = Apple.JHON.GetURL();
		System.out.println(winesap);
		System.out.println(john);
		System.out.println(cortland);

		
//		Example 2 Return all data as array from enum
//		Apple apple [] = Apple.values();
//		for (Apple apple2 : apple) {
//			System.out.println(apple2.DEFAULT_URL);
//		}

//		Example 3 Return WINESAP if enum contains it
//		Apple apple;
//		apple = Apple.valueOf("WINESAP");
//		System.out.println(apple);
	}
}
