package Practice;

public class SumofevenNumberinGivenArray {

	public static void main(String[] args) {
		
		int a[] = {6,7,8,3,1,2,9,12, 13,24};
		

		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0) {
				sum = a[i]+sum;
			}
		}
		System.out.println(sum);
	}
	
}
