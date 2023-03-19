package First_Day;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Ente the number to cheack the given condition");

		int n = sc.nextInt();

		if (n % 5 == 0 && n % 3 == 0) {
			System.out.println("hiii");
		} else if (n % 5 == 0) {
			System.out.println("Byee");
		} else if (n % 3 == 0) {
			System.out.println("Viekyeee");

		}else {
			System.out.println("Good Bye");
		}

	}

}
