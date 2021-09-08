package if_else;

import java.util.Scanner;

public class StrictlyIncreasingDecreasing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int prev = sc.nextInt();
		int count = 2, current;
		boolean isDec = true;
		
		while(count <= n) {
			current = sc.nextInt();
			count++;
			
			if(current == prev) {
				System.out.println("false");
				return;
			} else if(current < prev) {
				if(isDec == false) {
					System.out.println("false");
					return;
				}
			} else {
				if(isDec == true) {
					isDec = false;
				}
			}
			prev = current;
		}
		System.out.println("true");
		
		sc.close();

	}

}
