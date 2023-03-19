package Practice;

import java.util.Scanner;

public class NumberPractice {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to chaeck it is polodrom or not");
		int num = sc.nextInt();
		
		int number = num;
		
		int rev = 0;
		
		while (num!=0) {
			int digit = num%10;
			rev = (rev*10) + digit;
			num = num/10;
		}
		
		if (rev == number ) {
			System.out.println(number+"  This is polidrom number ");
		}else {
			System.err.println(number+"  This is not polidrom number ");

		}
		
	}

}
