 package String;

import java.util.LinkedHashSet;

public class DuplicateCharecterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "testyantra";

		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {

			lh.add(s.charAt(i));
		}

		for (Character ch : lh) {

			int count = 0;

			for (int i = 0; i < s.length(); i++) {

				if (ch == s.charAt(i)) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println("Duplicate charecter=======" + ch);
			}

			System.out.println();

			if (count == 1) {
				System.out.println("NotDuplicate charecter=======" + ch);
			}

		}

	}

}
