import java.lang.Math;
import java.util.Scanner;

public class Test {
	
	public static int[] takeArrayInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
		
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
//		double dob[] = new double[3];
//		char[] character = new char[3];
//		String[] str = new String[2];
		
//		int n = str.length;
		
//		for(int i = 0; i < 4; i++) {
//			String[] str = new String[2];
//			System.out.println(str[0]);
//		}
		
//		int[] arr = takeArrayInput();
//		printArray(arr);
		
		int[][] arr = new int[2][2];
		System.out.println(arr);
	}
}
