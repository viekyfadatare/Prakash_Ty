package First_Day;

import java.util.Scanner;

public class FNEtsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to cheack the Condition");
		
		int n = sc.nextInt();
		
		if(n%5==0||n%3==0) {
			if(n%5==0&&n%3==0) {
				System.out.println("Both");
			}else if(n%5==0) {
				System.out.println("divisible by 5");
			}else if (n%3==0) {
				System.out.println("Divisible by 3");
			}
		}else {
			System.out.println("Nothing");
		}

	}

}
