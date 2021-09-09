import java.util.Scanner;

public class ArrangeNumbersInArrays {
	
	public static void fillArray(int n) {
		int[] arr = new int[n];
		int count = 1, i = 0, j = n - 1;
		while (count <= n) {				// Also can use i <= j
			if(count % 2 != 0) {
				arr[i] = count;
				i++;
			} else {
				arr[j] = count;
				j--;
			}
			count++;
		}
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			fillArray(n);
		}
		sc.close();

	}

}
