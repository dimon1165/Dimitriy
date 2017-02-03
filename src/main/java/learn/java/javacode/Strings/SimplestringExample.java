package learn.java.javacode.Strings;
/**
 *  String object is immutable
 *  Strings equality: "==" compares the values if the points to the same objects
 *  In this case if we create to strings with equal content it will return false
 *  but if we use equals  it will return true because equals in this case will be check the content of strings
 *  row by row.
 *
 * */

public class SimplestringExample {
	public static void main(String[] args) {
		String string = "Первая строка";
        String string1 = "Первая строка";

//        equals works here correctly
        if (string.equals(string1)){
            System.out.println("The string objects is equals");
        }

//      here string3 will reference to the same object
//      as string2 because intern method returns canonicalize version of object
//      in this case "==" will return true but the plus is that method is very inexpensive
//      instead of equals.
        String string2 = string1.intern();
        String string3 = string2.intern();
        if (string2 == string3){
            System.out.println("The string intern object is equal");
        }

//        methods
		System.out.println(string.charAt(3));
		System.out.println(string.length());
		System.out.println(string.trim());
        System.out.println(string.lastIndexOf("о"));
		System.out.println(string.endsWith("а"));
		System.out.println(string.substring(0, 6));

//      valueOf automatically convert int to String
        int iVal = 100;
        String sVal = String.valueOf(iVal);
        System.out.println(sVal);
    }
}
