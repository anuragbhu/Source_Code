package if_else;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int binary = 0, pow = 1;
		
		while(n > 0) {
			
			int lastBit = n % 2;
			
			binary += lastBit * pow;
			pow *= 10;
			
			n /= 2;
		}
		
		System.out.println(binary);
		
		sc.close();

	}

}
