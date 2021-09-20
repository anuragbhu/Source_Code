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
//		rearrangeOptimal(arr, n); //  TC = O(n), SC = O(1) ---  in-place rearranging algorithm --- Two Pointer Approach/Algorithm
//		rearrangeSimple(arr, n); //  TC = O(n), SC = O(1) ---  in-place rearranging algorithm --- Two Pointer Approach/Algorithm
		rearrangeOrderMatters(arr, n);
		System.out.println("Output");
		printArray(arr, n);
		sc.close();

	}
	
	public static void rearrangeSimple(int[] arr, int n) {
		
		int j = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] < 0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j++] = temp;
			}
			
			printArray(arr, n);
			System.out.println();
		}
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
	
	// Order Matters --- Not Possible in TC = O(n) and SC = O(1)
	// https://stackoverflow.com/questions/4897280/given-an-array-of-positive-and-negative-integers-re-arrange-it-so-that-you-have
	public static void rearrangeOrderMatters(int[] arr, int n) {
		
		int positive[] = new int[n];
		int negative[] = new int[n];
		
		int neg = 0, pos = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] < 0) {
				negative[neg] = arr[i];
				neg++;
			} else {
				positive[pos] = arr[i];
				pos++;
			}
		}
		
		int i = 0;
		
		for(int j = 0; i < n && j <= neg; i++, j++) {
			arr[i] = negative[j];
		}
		i--;
		for(int j = 0; i < n && j <= pos; i++, j++) {
			arr[i] = positive[j];
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
