import java.util.Scanner;

public class ArrayEquilibriumIndex
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sumArray = 0;
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sumArray += arr[i];
        }
        
        int sumBegin = 0, sumEnd = 0;
        
        for(int i = 0; i < n; i++) {
            
            sumEnd = sumArray - arr[i] - sumBegin;
            
            if(sumBegin == sumEnd) {
                System.out.println(i);
                return;
            }
            
            sumBegin += arr[i];
            
        }
        
        System.out.println(-1);
	}
}
