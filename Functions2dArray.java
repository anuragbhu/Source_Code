import java.util.*;

public class Functions2dArray
{
    
    public static void printArray2d(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] inputArray2d() {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int[][] arr2d = new int[row][col];
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        
        return arr2d;
    }
    
	public static void main(String[] args) {
		int input[][] = inputArray2d();
		printArray2d(input);
	}
}
