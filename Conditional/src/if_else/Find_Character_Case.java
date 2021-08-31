package if_else;

import java.util.Scanner;

public class Find_Character_Case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		if(c >= 'A' && c <= 'Z') {
			System.out.println(1);
		} else if (c >= 'a' && c <= 'z') {
			System.out.println(0);
		} else {
			System.out.println(-1);
		}
		
		sc.close();
	}

}
