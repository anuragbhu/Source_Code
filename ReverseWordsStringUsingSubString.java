import java.util.*;

public class ReverseWordsStringUsingSubString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int index = str.length()-1;
		int end = str.length();
		String revStr = "";
		
		while(index >= 0) {
		    if(str.charAt(index) == ' ') {
		        revStr += str.substring(index+1, end) + " ";
		        end = index;
		    }
		    
		    index--;
		}
		revStr += str.substring(index+1, end);
		System.out.println(revStr);
	}
}
