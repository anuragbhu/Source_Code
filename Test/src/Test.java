/*
* * * * *	 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

 * * * * *  
  * * * *   
   * * *    
    * *     
     *      
     *      
    * *     
   * * *    
  * * * *   
 * * * * *  
*/
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}
	
	
	public static void pattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for(int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			for(int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
