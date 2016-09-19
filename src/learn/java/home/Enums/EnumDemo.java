package learn.java.home.Enums;

public class EnumDemo{
   
	public enum Apple{
		JHON ("http://localhost:8080/HealthBody-WebService/listener/%s/%d/%s"),
		GOLDEN("http://localhost:8080/HealthBody-WebService"),
		REDDEDL("http://localhost:8080/HealthBody-"),
		WINESAP("http://localhost:8080/"),
		CORTLAND("http://localhost");
		
//		String which we use in constructor
		public String DEFAULT_URL;
		
//      Constructor for each enum
		private Apple(String dEFAULT_URL) {
			DEFAULT_URL = dEFAULT_URL;
		}

//		Default constructor put default URL if other constructors not initialized
		private Apple() {
			DEFAULT_URL = "http://localhost";  
		}
		
//		To get string in enum
		 String GetURL(){
			return DEFAULT_URL;
		}
		
	}  

	public enum Groups{
	GET_GROUPS_PART_NUMBER_PART_SIZE("%s/HealthBody-WebService/listener/%s?partNumber=%d&partSize=%d");
	
	private String urlForConnetionToListener;

	private Groups(String urlForConnetionToListener) {
		this.urlForConnetionToListener = urlForConnetionToListener;
	}

	public String getUrlForConnetionToListener() {
		return urlForConnetionToListener;
	}

	}
}
