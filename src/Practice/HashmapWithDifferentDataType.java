package Practice;

import java.util.HashMap;

public class HashmapWithDifferentDataType {

	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		
		hm.put('a', 11.5f);
		hm.put('b', 11);
		hm.put('c', true);
		hm.put('d', 12345678);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		
	}
	
}
