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
		int check = Integer.MAX_VALUE;
		boolean  flag = true;
		
		for(int i = 1; i <= n; i++) {
			int temp =  sc.nextInt();
			if(temp < check) {
				if(!flag) {
					System.out.println(false);
					return;
				}
			} else if(temp > check) {
				flag = false;
			} else {
				System.out.println(false);
				return;
			}
			check = temp;
		}
		
		System.out.println(true);
		
		
		
//		pattern(n);

//		int prod = 1;
//		
//		for(int i = 2; i<= n; i++) {
//			prod *= i;
//		}
//		
//		System.out.println(prod);
		
		sc.close();
	
		
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
