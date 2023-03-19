package String;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class Pract {

	public static void main(String[] args) {

	
	String s = "aabnsdjvbfsdb";
	
	LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
	
	for (int i = 0; i < s.length(); i++) {
		lh.add(s.charAt(i));
	}
	
	for (Character ch : lh) {
		System.out.print(ch);
	}
	
	}
}
