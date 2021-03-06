import java.util.Arrays;
import java.util.Scanner;

public class KthMaxMin {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		
		kthMaxMin(arr, n, k); // TC = O(nlogn), SC = O(1) for array having n elements --- Brute Force Approach
		
	}
	
	public static void kthMaxMin(int[] arr, int n, int k) {
		Arrays.sort(arr);
		System.out.println(k + "th/nd Max: " + arr[n-k] + "\t" + k + "th/nd Min: " + arr[k-1] );
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
