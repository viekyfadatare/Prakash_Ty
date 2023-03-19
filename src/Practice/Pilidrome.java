package Practice;

import java.util.Scanner;

public class Pilidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is polidrom or not");
		
		int n = sc.nextInt();
		
		int num = n;
		
		int rev = 0;
		
		while(n!=0) {
			
			int digit = n%10;
			
			rev = (rev*10)+digit;
			n = n/10;
			
		}
		
		//System.out.println(rev);
		
		if (num==rev) {
			
			System.out.println(num+" ===== is  Number is polidrom");
		}else {
			System.out.println(num+" ===== is not Number is polidrom");
		}
		

	}

}
