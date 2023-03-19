package Collection;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap a1 = new HashMap();
		
		System.out.println(a1.size());
		
		a1.put(10, "Vieky");
		a1.put(20, "ganesh");
		a1.put(30, "Shailesh");
		a1.put(11, "Mishaq");
		a1.put(12, "sunil");
		
		System.out.println(a1);
		
		a1.remove(-1);
		
		System.out.println(a1);
		
		a1.clear();
		
		System.out.println(a1);

		

	}

}
