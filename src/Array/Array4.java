package Array;
// sum of the even number i the giuven array
// sum of product of odd number from the given array
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,7,9,3,6,8};
		
		
		int sum = 0;
		int prod = 1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				sum = sum +a[i];
			}else {
				prod = prod*a[i];
			}
		}
		System.out.println();
		
		System.out.println("Sum of the even number is =   "+ sum);
		
		System.out.println();
		
		System.out.println("Product of the odd number from the given array is =   "+prod);

	}

}
