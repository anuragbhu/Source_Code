package function;

import java.util.Scanner;

public class PrimeTwoToN {
	
	public static boolean isPrime(int n) {
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void printPrime(int n) {
		
		for(int i = 2; i <= n; i++) {
			boolean ansPrime = isPrime(i);
			
			if(ansPrime)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		printPrime(n);
		
		sc.close();
	}

}
