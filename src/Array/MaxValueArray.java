package Array;

public class MaxValueArray {

	public static void main(String[] args) {

		int a[] = { 6, 1, 3, 7, 9, 8, 4, 12, 0 };

		int max = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] >max) {
				max = a[i];
			} 

		}
		System.out.println("Maximum number in given Array is == " + max);

	}

}
