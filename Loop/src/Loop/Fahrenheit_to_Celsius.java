package Loop;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		
		for(int i = S; i<= E; i += W) {
			int temp = (5 *(i - 32)) / 9;
			System.out.println(i + "\t" + temp);
		}
	}

}
