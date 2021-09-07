package Loop;

import java.util.*;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		System.out.println((nthFibonacci(n)));
		System.out.println((nthFibonacciIterative(n)));

	}
	
	public static int nthFibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		}
		
		return nthFibonacci(n-1) + nthFibonacci(n-2);
	}
	
	
	public static int nthFibonacciIterative(int n) {
		
		int res = 1, secondLast = 1, last = 1;
		
		for(int i = 3; i <= n; i++) {
			res = secondLast + last;
			secondLast = last;
			last = res;
		}
		
		
		return res;
	}

}
