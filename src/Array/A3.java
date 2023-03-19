package Array;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 5, 7, 9, 8, 4, 10, 11 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("After Sorting ======== ");
		System.out.println();
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "  ");

		}

		System.out.println();

		int sum = 0;
		for (int i = a.length - 3; i < a.length; i++) {

			sum = sum + a[i];
		}

		System.out.println();

		System.out.print("Sum of last max three num is ========= " + sum);

		System.out.println();

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {

			sum1 = sum1 + a[i];

		}

		System.out.println();
		System.out.println("Sum of first three min number is  =========  " + sum1);

	}

}
