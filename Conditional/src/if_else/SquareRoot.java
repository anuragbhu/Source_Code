package if_else;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sqrt = 0;
		

		while(sqrt*sqrt <= n) {
			sqrt++;
		}
		
		System.out.println(sqrt-1);
		
		sc.close();
		
	}

}
