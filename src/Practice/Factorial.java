package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to get factorial");

		int n = sc.nextInt();

		int i = 1;
		int result = 1;

		while (i <= n) {
			result = result * i;
			i++;
		}

		System.out.println(result);
	}

}
