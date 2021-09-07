package if_else;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int des = 0, pow = 1;
		
		while(n > 0) {
			int last = (n % 10);
			
			// Using pow function
//			des += ((int) Math.pow(2, count)) * last;
			
			des += pow * last;
			
			// Using manual multiplication
			pow *= 2;
			
			n /= 10;
			
//			count++;
		}
		
		System.out.println(des);
		
		sc.close();
		
	}

}
