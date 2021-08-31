import java.util.Arrays;
import java.util.Scanner;

public class NegativeElementsToOneSide {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		
//		Order of elements is not important here.
//		rearrange(arr, n); // TC = O(nlogn), SC = O(1) for array having n elements --- Brute Force Approach
		rearrangeOptimal(arr, n); //  TC = O(n), SC = O(1) ---  in-place rearranging algorithm --- Two Pointer Approach/Algorithm
		
		printArray(arr, n);
		sc.close();

	}
	
	public static void rearrangeOptimal(int[] arr, int n) {
		
		int left = 0, right = n - 1;
		
		while(left <= right) {
			
			if(arr[left] >= 0 && arr[right] < 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			} else if (arr[left] >= 0 && arr[right] >= 0) {
				right--;
			} else if (arr[left] < 0 && arr[right] < 0) {
				left++;
			} else {
				left++;
				right--;
			}
		}
	}
	
	public static void rearrange(int[] arr, int n) {
		Arrays.sort(arr);
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
