package Practice;

public class ArryaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {5,9,7,1,6,23,24,12};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]<a[j]) {
				int temp = a[i];
				a[i] = a[j];				
				a[j]= temp;				
				}
				
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
			
		}
		
	}

}
