import java.util.*;

public class ReverseWordsString
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String revWords = "";
		int j = 0;
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
		    String temp = "";
			if(str.charAt(i) != ' ') {
			    count++;
			    for(j = i; j < str.length(); j++) {
			        if(str.charAt(j) == ' ') {
			            i = j - 1;
			            break;
			        } else {
			            temp += str.charAt(j);
			        }
			    }
			    
			    if(count == 1) {
    			    revWords = temp + revWords;
    			} else {
    			    revWords = temp + " " + revWords;
    			}
			}
			
			
			if(j == str.length())
			    break;
			
		}
		
		System.out.println(revWords);
	}
}
