package Practice;

import java.util.Scanner;

public class PrimeNO {

	public static void main(String[] args) {
		
		
		Scanner  sc = new Scanner(System.in);
		
		
		System.out.println("Enter the num ber to check it is prime or not");
		
		int n = sc.nextInt();
		
		int i = 2;
		
		while(i<=n) {
			
			if(n%i ==0) {
				break;
			}
			i++;
		}
		
		if(i==n) {
			System.out.println(n +"  is prime number ");
		}else {
			System.out.println(n +"  is not prime number ");
		}

	}
 
}
