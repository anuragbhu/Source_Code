import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String src = sc.next();
		
		sc.close();
		
		if(src.charAt(n-1) == 'o') {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
