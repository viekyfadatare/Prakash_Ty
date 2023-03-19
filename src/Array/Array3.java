package Array;

// sum of the three greater value in the given array
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 6, 7, 3, 4, 10, 45 };

		// sorting in the decending order
		System.out.println("Array sorting inthe decending order");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + "  ");
		}
		
		System.out.println();
// sum of max three n umber in the given array
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + a[i];
		}

		System.out.println("sum of last three max number is=  " + sum);

		System.out.println();
		
		// sum of min three number
		int sum2 = 0;
		for (int i = a.length-3; i<a.length; i++) {
			sum2 = sum2 + a[i];
			
		}
		System.out.println("sum of last three min number is=  " + sum2);

	}

}
