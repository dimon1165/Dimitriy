package learn.java.javacode.Strings;

public class SimplestringExample {
	public static void main(String[] args) {
		String string = "Первая строка";
		System.out.println(string.charAt(3));
		System.out.println(string.length());
		System.out.println(string.trim());
		System.out.println(string.lastIndexOf("о"));
		System.out.println(string.intern());
		System.out.println(string.endsWith("а"));
		System.out.println(string.substring(0, 6));
	}
}
