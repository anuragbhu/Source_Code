package function;

import java.util.*;

public class NcR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		System.out.println((nCr(n)/(nCr(n-r)*nCr(r))));
		
		sc.close();
		

	}
	
	public static int nCr(int n) {
		
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		return fact;
	}

}
