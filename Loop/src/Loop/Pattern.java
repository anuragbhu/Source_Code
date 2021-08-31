package Loop;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
	}
	
	public static void pattern(int num) {
		
		int row = 1;
		while (row <= num) {
			int col = 1, space = 1, value = row;
			
			while((num-space) >= row) {
				System.out.print("\t");
				space++;
			}
			
			while (col <= row) {
				System.out.print(value + "\t");
				col++;
				value++;
			}
			System.out.println();
			row++;
			
		}
		
	}
}
