package Practice;

import java.util.Scanner;

public class NthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the Power  ");
		
		int p = sc.nextInt();
		
		
		int result = 1;
		
		for (int i = 0; i <p; i++) {
			
			result = result*n;
		}
		
		
		System.out.println("OutPut will be ===== " + result);

		
	}

}
