package String;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharecterOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbkkeett";

		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));

		}
		
		for (Character ch : lh) {
			System.out.print(ch+" ");
		}

	}

}
