package Collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();

		//System.out.println(a.size());

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(10);
		a.add(20);
		
		
	//	System.out.println(a.r);
		ArrayList a1 = new ArrayList();

		//System.out.println(a.size());

		a1.add(10);
		a1.add(20);
		a1.add(45);
		a1.add(10);
		a1.add(10);
		a1.add(20);
		
		
		a.removeAll(a1);
		
		System.out.println(a);
		


	}

}
