package if_else;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sqrt = 0, pow = 2;
		

		while(pow <= n) {
			pow *= 2;
			sqrt++;
		}
		
		System.out.println(sqrt);
		
		sc.close();
		
	}

}
