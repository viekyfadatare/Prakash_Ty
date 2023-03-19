package WEn;

public class SumOfIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 6, 7, 9, 8, 4 };
		int b[] = { 3, 2, 1, 8 };
		
		int result [] = new int[a.length];
		try {
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i]+b[i];
		}
		}
		catch(Exception e)
		{
			for (int i = b.length; i < result.length; i++) {
			result[i]=result[i]+a[i];
		}
			}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}

	}

}
