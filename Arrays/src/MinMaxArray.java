import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		
//		minMaxArray1(arr, n); // TC = O(nlogn), SC = O(1), Comparison = 0 --- Brute Force Approach
//		minMaxArray2(arr, n); // TC = O(n), SC = O(1), Comparison = 2n --- Better Approach
		minMaxArray3(arr, n); // TC = O(n), SC = O(1), Comparison = 3n/2 + 2 --- Optimal Approach
		sc.close();

	}
	
	public static void minMaxArray1(int[] arr, int n) {
		Arrays.sort(arr);
		System.out.println(arr[0] + "\t" + arr[n-1]);
	}
	
	public static void minMaxArray2(int[] arr, int n) {

		
		if(n == 1) {
			System.out.println(arr[0] + "\t" + arr[0]);
			return;
		}
		
		int min = Integer.MAX_VALUE; // + Infinite Integer Value
		int max = Integer.MIN_VALUE; // - Infinite Integer Value
		
		for(int i = 0; i < n; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max + "\t" + min);

	}

	public static void minMaxArray3(int[] arr, int n) {
		
		if(n == 1) {
			System.out.println(arr[0] + "\t" + arr[0]);
			return;
		}
		int temp = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		// Boundary Condition
		if(n % 2 == 0) {
			temp = 0;
		} else {
			max = arr[0];
			min = arr[0];
			temp = 1;
		}
		
		for(int i = temp; i < n-1; i=i+2) {
			if(arr[i] > arr[i+1]) {
				if(arr[i] > max) {
					max = arr[i];
				}
				if(arr[i+1] < min) {
					min = arr[i+1];
				}
			} else {
				if(arr[i+1] > max) {
					max = arr[i+1];
				}
				if(arr[i] < min) {
					min = arr[i];
				}
			}
		}
		System.out.println("max: "  + max + "\t" + "min: " + min);
		
	}
}
