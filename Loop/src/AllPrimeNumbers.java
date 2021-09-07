import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		allPrimeNumbers(n);

	}
	
	public static void allPrimeNumbers(int n) {
		
		for(int i = 2; i <= n; i++) {
			
			boolean flag = false;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = true;
					break;
				}
			}
			
			if(!flag)
				System.out.println(i + " ");
				
		}
	}

}
