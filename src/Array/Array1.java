package Array;

// Sort the given array in acending order
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 6, 8, 9, 10, 48, 3, 7 };

		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					
					int tem = a[i];
					a[i] = a[j];
					a[j] = tem;
				}
				
			}
			System.out.print(a[i]+"  ");
		}
	}

}
