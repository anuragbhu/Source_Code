import java.util.*;

public class StringPalindrome
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int start = 0, end = str.length()-1;
		
		while(start < end) {
		    if(str.charAt(start) != str.charAt(end)) {
		        System.out.println(false);
		        return;
		    }
		    start++;
		    end--;
		}
		
		System.out.println(true);
	}
}
