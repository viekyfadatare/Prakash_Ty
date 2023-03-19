package Array;

import java.util.Scanner;

// take  the value frome user in the array
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");

		int size = sc.nextInt();

		int a[] = new int[size];

		// input for array
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the nt Value=  " + i);
			a[i] = sc.nextInt();

		}

		// printing the user input array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

// sorting array
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		System.out.println();

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

}
