package WEn;

import java.util.LinkedHashSet;

public class TestCompony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Tester";

		s = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character ch : set) {
			for (int i = s.length() - 1; i >= 0; i--) {
				if (ch == s.charAt(i)) {

					System.out.println(ch + " = " + (i + 1));
					break;
				}
			}
		}
	}

}
