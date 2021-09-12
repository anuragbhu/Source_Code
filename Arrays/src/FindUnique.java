import java.util.Arrays; // Arrays.sort()
import java.util.Scanner;

public class FindUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(unique(arr, n)); // TC = O(n), SC = O(1) for array having n elements --- Optimal Approach
		System.out.println(uniqueUsingSort(arr, n)); // TC = O(nlogn), SC = O(1) for array having n elements --- Best Approach
		System.out.println(uniqueUsingTwoLoop(arr, n)); // TC = O(n^2), SC = O(1) for array having n elements --- Brute Force Approach
		sc.close();
	}
	
	public static int unique(int[] arr, int n) {
		int xor = 0;
		for(int i = 0; i < n; i++) {
			xor ^= arr[i];
		}
		return xor;
	}
	
	public static int uniqueUsingTwoLoop(int[] arr, int n) {
	
		for(int i = 0; i < n; i++) {
			boolean flag = false;
			for(int j = 0; j < n; j++) {
				if(i != j) {
					if(arr[i] == arr[j]) {
						flag = true;
						break;
					}
				}
			}
			
			if(!flag) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	
	public static int uniqueUsingSort(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i = 0; i < n-1; i += 2) {
			if(arr[i] != arr[i+1]) {
				return arr[i];
			}
		}
		return arr[n-1];
	}

}
