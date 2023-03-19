package First_Day;

import java.util.Scanner;

public class HiBye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number get to check the conditions");
		int n = sc.nextInt();

		if (n % 5 == 0 && n % 3 == 0) {
			System.out.println("Hi  Bye");
		} else if (n % 3 == 0) {
			System.out.println("Bye");
		} else if (n % 5 == 0) {
			System.out.println("Hi ");
		} else {
			System.out.println("Good Bye");
		}

	}

}
