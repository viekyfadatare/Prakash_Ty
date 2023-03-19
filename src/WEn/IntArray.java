package WEn;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = {2,5,6,0,0,4,0,7};
		
		int a2 [] = new int [a1.length];
		
		int m = 0;
		int n= a1.length-1;
		
		for (int i = 0; i < a1.length; i++) {
			if(a1[i]==0) {
				a2[n]=a1[i];
				n--;
			}else {
				a2[m]=a1[i];
				m++;
			}
		}
		
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+"  ");
		}
		
		System.out.println();
		System.out.println("After sorting");
		System.out.println();
		
		// sorting 
		for (int i = 0; i < a2.length-3; i++) {

		for (int j = i+1; j < a2.length-3; j++) {
			if(a2[i]>a2[j]) {
				
				int temp = a2[i];
				a2[i]=a2[j];
				a2[j]=temp;
				
			}
		}
		}
		
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+"  ");
		}

	}

}
