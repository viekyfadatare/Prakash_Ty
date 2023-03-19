package Array;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 7, 9, 8, 4, 1, 3, 6, 11, 12, 15, 14, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		System.out.println("After sorting    ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

		System.out.println();

		int sum = 0;
		int prod = 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			} else {
				prod = prod * a[i];
			}

		}
		
		System.out.println();
		
		System.out.println("Sum of Even number is ====== " + sum);
		
		System.out.println();

		System.out.println("Porduct of odd number is ====== " + prod);

	}

}
