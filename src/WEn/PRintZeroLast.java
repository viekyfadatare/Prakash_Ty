package WEn;

public class PRintZeroLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		int a[] = { 1, 5, 7, 93, 0, 4, 0, 5, 0, 4, 0 };

		int b[] = new int[a.length];

		int m = 0;

		int n = a.length - 1;

		for (int i = 0; i < b.length; i++) {
			if (a[i] == 0) {
				b[n] = a[i];
				n--;

			}else {
				b[m]=a[i];
				m++;
			}
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
