package Array;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 6, 7, 8, 3, 4, 9, 1, 0 };

		System.out.println("Size of an Array is  ====  " + a.length);

		System.out.println();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Arrya In Desinging Order is ======= ");
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

	}

}
