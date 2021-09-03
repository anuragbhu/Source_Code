package if_else;

import java.util.Scanner;
import java.lang.Math;

public class TotalSalary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int basic = sc.nextInt();
		char allow = sc.next().charAt(0);
		
		double hra = basic * 0.2;
		double da = basic * 0.5;
		double pf = basic * 0.11;
		
		int allow_value = 0;
		
		if(allow == 'A') {
			allow_value = 1700;
		} else if(allow == 'B') {
			allow_value = 1500;
		} else {
			allow_value = 1300;
		}
		
		int salary = (int) Math.round(basic + hra + da - pf + allow_value);
		
		
		System.out.println(salary);
		
		
		sc.close();
		

	}

}
