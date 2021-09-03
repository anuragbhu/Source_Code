import java.util.Scanner;


public class CyclicRotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		
		rotateArray(arr, n, k);
		printArray(arr, n);
	}
	
	
	public static void rotateArray(int[] arr, int n, int k) {
		
		int count = n, index;
		
		while(count >= 1) {
			
			index += k;
			
			count--;
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
