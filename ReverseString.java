import java.util.*;

public class ReverseString
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String revStr = "";
		
		// Forward Iteration
		for(int i = 0; i < str.length(); i++) {
		    revStr = str.charAt(i) + revStr;
		}
		
		
		// Backward Iteration
// 		for(int i = str.length()-1; i >= 0; i--) {

// 		    revStr += str.charAt(i);
// 		}
		
		System.out.println(revStr);
	}
}
