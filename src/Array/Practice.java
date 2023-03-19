package Array;

public class Practice {
	
	public static void main(String[] args) {
		
		int a [] = {23,53,1,6,4,99,45,30};
	
	 
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
		}
		
	}
	
}
