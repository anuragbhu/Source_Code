import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		int start = 0, end = n-1;
		
		reverseArrayBruteForce(arr, n); // TC = O(nlogn), SC = O(1) --- Brute Force Approach
//		reverseArrayIterative(arr, n);  // TC = O(n), SC = O(1) --- Optimal Iterative Approach
//		reverseArrayRecursive(arr, start, end);  // TC = O(n), SC = O(1) --- Optimal Recursive Approach
//		printArray(arr, n);
		sc.close();

	}
	
	public static void reverseArrayBruteForce(int[] arr, int n) {
		int[] result = new int[n];
		for(int i = 0; i < n; i++) {
			result[n-i-1] = arr[i];
		}
		printArray(result, n);
	}
	
	public static void reverseArrayRecursive(int[] arr, int start, int end) {

		if(start >= end)
			return;
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArrayRecursive(arr, start+1, end-1);
	}
	
	public static void reverseArrayIterative(int[] arr, int n) {
		
		int i = 0, j = n-1;
		while(i < j) {
			
			arr[i] += arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] -= arr[j];
			
			i++;
			j--;
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
		
}
