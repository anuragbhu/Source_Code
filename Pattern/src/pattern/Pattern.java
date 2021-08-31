package pattern;

import java.util.*;

public class Pattern {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
		sc.close();
	}
	
	public static void pattern(int n) {
		
		int row = 1;
		System.out.println("*");
		while(row <= n) {
			System.out.print("*");
			int col = 1;
			
			while(col <= row) {
				System.out.print(col);
				col++;
			}
			col = row -1;
			while(col >= 1) {
				System.out.print(col);
				col--;
			}
			
			System.out.print("*");
			System.out.println();
			row++;
		}
		row = n -1;
		
		while(row >= 1) {
			System.out.print("*");
			int col = 1;
			
			while(col <= row) {
				System.out.print(col);
				col++;
			}
			col = row -1;
			while(col >= 1) {
				System.out.print(col);
				col--;
			}
			
			System.out.print("*");
			System.out.println();
			row--;
		}
		
		System.out.println("*");
		
	}
}
