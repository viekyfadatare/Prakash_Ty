package String;

import java.util.HashSet;

//remove duplicate value
public class RemoveDuplicateCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s = "aabbccddeeff";
		
		HashSet<Character> h = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			h.add(s.charAt(i));
		}
		for (Character ch : h) {
			
			System.out.print(ch+"  ");
		}*/
		
		String s = "aabbccddeeff";
		
		HashSet<Character> h = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			h.add(s.charAt(i));
		}
		
		for (Character ch : h) {
			
			System.out.print(ch+" ");
		}

	}

}
