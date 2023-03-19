package Practice;

import java.util.Scanner;

public class PolidromCheck {

	
	public static int Reverse(int n) {
		
		int rev = 0;
		
		while(n!=0) {
			int digit = n%10;
			rev = (rev*10)+digit;
			
			n = n/10;
					
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to cheack it is polodrom or not");
		
		int num = sc.nextInt();
		
		int rev = Reverse(num);
		
		
		if(num==rev) {
			
			System.out.println("The given number is polidrom");
		}else {
			System.out.println("The given number is not polidrom");
		}
		
	}

}
