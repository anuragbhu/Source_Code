import java.util.*;

public class LargestRowOrColumn
{
    
    public static void printArray2d(int[][] arr) {
        boolean rowUse = true;
        int index = -1;
        int maxSum = Integer.MIN_VALUE;
        
        if(arr.length == 0) {
            System.out.println("row " + 0 + " " + maxSum);
            return;
        }
        
        int row = arr.length;
        int col = arr[0].length;
        
        for(int i = 0; i < row; i++) {
            int sum = 0;
            for(int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            if(sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        for(int i = 0; i < col; i++) {
            int sum = 0;
            for(int j = 0; j < row; j++) {
                sum += arr[j][i];
            }
            if(sum > maxSum) {
                maxSum = sum;
                index = i;
                rowUse = false;
            }
        }
        
        if(rowUse) {
            System.out.println("row " + index + " " + maxSum);
        } else {
            System.out.println("col " + index + " " + maxSum);
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
