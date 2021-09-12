import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(duplicateUsingTwoLoops(arr, n)); // TC = O(n^2), SC = O(1) for array having n elements --- Brute Force Approach
		System.out.println(duplicateUsingSorting(arr, n)); // TC = O(nlogn), SC = O(1) for array having n elements --- Better Approach
		System.out.println(duplicateUsingExtraSpace(arr, n)); // // TC = O(n), SC = O(n) for array having n elements --- Optimal Approach
	}
	
	public static int duplicateUsingExtraSpace(int[] arr, int n) {
		
		int[] count = new int[n-1];
		
		for(int i = 0; i < n; i++) {
			int temp = arr[i];
			count[temp]++;
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i] == 2) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
	}
	
	
	public static int duplicateUsingSorting(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == arr[i+1]) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	
	
	public static int duplicateUsingTwoLoops(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return Integer.MAX_VALUE;
	}

}
