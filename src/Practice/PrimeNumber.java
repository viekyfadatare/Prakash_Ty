package Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to validate prime or not");
		
		int n = sc.nextInt();
		
		int i = 2;
		
		while(i<=n) {
			
			if(n%i==0) {
				break;
			}
			i++;
		}
		
		if(i==n) {
			System.out.println(n+" ==== It is prime number");
		}else {
			System.out.println(n+" ==== is not Prime Number");
		}
		
		
		
	
}		
			
		

	}


