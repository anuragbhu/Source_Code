import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] num = new int[m];
		for(int i = 0; i < m; i++) {
			num[i] = sc.nextInt();
		}
		
//		intersection(arr, num); // (O(n+m) + O(nlogn) + O(mlogm)) --- Sorting
		intersectionUsingLoops(arr, num); // O(n^2) --- Loops
	}
	
	public static void intersectionUsingLoops(int[] arr, int[] nums) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(arr[i] == nums[j]) {
					System.out.print(arr[i] + " ");
					nums[j] = Integer.MIN_VALUE; // In case of duplicate
					break;
				}
			}
		}
	}
	
	public static void intersection(int[] arr, int[] nums) {
		int i = 0, j = 0;
		Arrays.sort(arr);
		Arrays.sort(nums);
		
		while((i < arr.length) && (j < nums.length)) {
			if(arr[i] < nums[j]) {
				i++;
			} else if (arr[i] > nums[j]) {
				j++;
			} else {
				System.out.print(arr[i] + " ");
				i++;
				j++;
			}
		}
	}

}
