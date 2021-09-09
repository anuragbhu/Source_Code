import java.util.Scanner;

public class SwapAlternate {

	static Scanner sc = new Scanner(System.in);
	
	public static int[] takeArrayInput() {
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
		
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] swap(int[] arr) {
		for(int i = 0; i < arr.length - 1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int[] arr = takeArrayInput();
			arr = swap(arr);
			printArray(arr);
		}
	}

}
