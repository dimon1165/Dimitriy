package learn.java.javacode.Collections;

import java.util.Comparator;

public class TComp implements Comparator<String> {

	@Override
	public int compare(String AString, String BString) {
		int i,j,k;
		i = AString.lastIndexOf(' ');
		j = BString.lastIndexOf(' ');
		k = AString.substring(i).compareTo(BString.substring(j));
		if(k == 0){
			return AString.compareTo(BString);
		}
		return k;
	}
	
}
