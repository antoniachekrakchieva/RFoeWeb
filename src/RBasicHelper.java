import java.util.Arrays;

public class RBasicHelper {
	static String getMean(String str){
		str = str.replaceAll("[^-?0-9]+", " "); 
		for (int i=0; i< str.length(); i++) {
		    str.charAt(i);
		}
		String strI = Integer.toString(str.length());
		return strI;
	}
	
	static String getSum(String str){
		str = str.replaceAll("[^-?0-9]+", " "); 
		int sum = 0;
		for (int i=0; i< str.length(); i++) {
			sum += Integer.parseInt(str, str.charAt(i));
			System.out.println(sum);
		}
		String strI = Integer.toString(sum);
		return str;
	}
	
}
