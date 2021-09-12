import java.util.Scanner;

public class SortZeroOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sortedOneZero(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void sortedOneZero(int[] arr, int n) {
		int i = 0, j = n-1;
		while(i < j) {
			if(arr[i] == 0) {
				i++;
			} else if(arr[j] == 1) {
				j--;
			} else if(arr[i] == 1 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
	}

}
