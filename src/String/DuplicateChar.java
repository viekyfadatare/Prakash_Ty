package String;

import java.util.LinkedHashSet;

public class DuplicateChar {

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

				System.out.println(ch + " ====  Its A Duplicate Charecter In String ");

			}

			if (count == 1) {

				System.out.println(ch + " ====  Its Not Duplicate Charecter In String ");

			}
		}
	}

}
