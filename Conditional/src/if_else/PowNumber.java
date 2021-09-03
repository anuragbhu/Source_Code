package if_else;

import java.util.Scanner;

public class PowNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int pow = 1;
		
		for(int i = 1; i <= n; i++) {
			pow *= x;
		}
		
		System.out.println(pow);
		
		sc.close();
	}

}
