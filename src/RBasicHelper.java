import java.util.Arrays;

public class RBasicHelper {
	static String getMeanNumber(String str){
		str = str.replaceAll("[^-?0-9]+", " "); 
		String strI = Integer.toString(str.length());
		return strI;
	}
}
