import java.util.*;

public class AllSubstrings
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		for(int i = 0; i < str.length(); i++) {
		    String subString = "";
		    for(int j = i; j < str.length(); j++) {
		        subString += str.charAt(j);
		        System.out.println(subString);
		    }
		}
	}
}
