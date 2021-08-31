import java.util.Scanner;
import java.util.Arrays;

public class SortZeroOneTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		
//		sortArrayUsingSorting(arr, n); //  TC = O(nlogn), SC = O(1) --- Brute Force Approach
//		sortArray(arr, n); //  TC = O(n), SC = O(1) --- Counting Sort Algorithm (Without one pass)
		sortUsingDutchNationalFlag(arr, n); // //  TC = O(n), SC = O(1) --- Dutch National Flag Algorithm (with one pass)
		
		printArray(arr, n);
		sc.close();

	}
	
	public static void sortUsingDutchNationalFlag(int[] arr, int n) {
		int low = 0, mid = 0, high = n-1, temp = 0;
		
		while(mid <= high) {
			switch(arr[mid]) {
			case 0: {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
			}
		}
		
	}
	
	public static void sortArrayUsingSorting(int[] arr, int n) {
		Arrays.sort(arr);
	}
	
	public static void sortArray(int[] arr, int n) {
		int countZero = 0, countOne = 0, countTwo = 0;
		
		for(int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				countZero++;
			} else if(arr[i] == 1) { 
				countOne++;
			} else {
				countTwo++;
			}
		}
		
		int j = 0, i = 0;
		while(j < countZero) {
			arr[j] = 0;
			j++;
		}
		
		while(i < countOne) {
			arr[j] = 1;
			i++;
			j++;
		}
		i = 0;
		while(i < countTwo) {
			arr[j] = 2;
			i++;
			j++;
		}
		
		
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
