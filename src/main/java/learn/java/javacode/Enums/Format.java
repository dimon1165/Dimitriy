package learn.java.javacode.Enums;

import java.util.Formatter;

public class Format {
	
	private static final String BASE_URL_LOCAL_HOST = "http://localhost:8080";

	public static void main(String[] args) {

		try (Formatter format = new Formatter()){
		format.format(EnumDemo
				.Groups
				.GET_GROUPS_PART_NUMBER_PART_SIZE
				.getUrlForConnetionToListener(), BASE_URL_LOCAL_HOST, "Groups", 1, 1);
		System.out.println(format);
		
		}
	}
}
