import java.lang.Math;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int a = 60, b = 80;
//		
//		if(a == 60 || b++ > 80) {
//			System.out.println("Inside IF");
//		} else {
//			System.out.println("Inside ELSE");
//		}
//		
//		System.out.println("a: " + a + " b: " + b);
		System.out.println("\t" + 4);
		int a = 5;
		a += 5 + (++a) + (a++);
		System.out.println(a);
		
		
		
		sc.close();
	
		
	}

}
