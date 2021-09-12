import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(pairSum(arr, n, x)); // O(n^2) --- Loops
	}
	
	public static int pairSum(int[] arr, int n, int x) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if((arr[i] + arr[j]) == x) {
					count++;
				}
			}
		}
		return count;
	}

}
