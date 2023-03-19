package Practice;

public class BInaryArray {

	public static void main(String[] args) {
		
		
		int a [] = {0,0,0,1,1,1};
		
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				
				for (int j = 0; j < a.length-1; j++) {
					System.out.print(a[j]+" ");
					break;
				}
				
			}else {
				for (int j = a.length-1; j >=0 ; j--) {
					System.out.print(a[j]+" ");
					break;
				}
			}
			
		}

	}

}
