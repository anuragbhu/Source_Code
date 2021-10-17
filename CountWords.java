// This code will handle extra white spaces issue also.


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
 
		String str = sc.nextLine();
        
        int count = 0;
        
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
			    for(int j = i; j < str.length(); j++) {
			        if(str.charAt(j) == ' ') {
			            count++;
			            i = j - 1;
			         //   System.out.println(i);
			            break;
			        }
			    }
			}
		}
		
		if(str.length() > 0)
		    count++;
		System.out.println(count);
	}
}
