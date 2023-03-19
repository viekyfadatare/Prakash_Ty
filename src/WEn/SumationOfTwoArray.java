package WEn;

public class SumationOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {2,6,7,4,8,5,9,3};
		
		int b [] = {3,4,5,7,9,};
		
		int result [] = new int [a.length];
		
		try {
		for (int i = 0; i < result.length; i++) {
		result[i] = a[i]+b[i];	
		}
		}
		catch(Exception e) {
			for (int i = b.length; i < result.length; i++) {
				result[i] = result[i]+a[i];
			}
			
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
	}

}
