package WEn;

import java.util.Scanner;

public class SwappingOfFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1[]= {1,2,3,4,5};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of key1");

		int key = sc.nextInt();
		
		for (int i = key; i < arr1.length; i++) {
			System.out.print(arr1[i]+"  ");
		}
		
		for (int i = 0; i < key; i++) {
			System.out.print(arr1[i]+"  ");
		}
		

}
}