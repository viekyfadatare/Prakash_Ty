package Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import String.Arraylist;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "SHWETHA";
		String s2 = s.toLowerCase();
		char[] ch = s2.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}

		String a = "shwetha";

		String[] s1 = a.split("");

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(s1[i]);
		}
		System.out.println();

		String p = "shwetha";

		String p1 = p.substring(4, 7);

		System.out.println(p1);

		String w = "geetha";
		
		 LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		
		//ArrayList<Character> lh = new ArrayList<Character>();
		for (int i = 0; i < w.length(); i++) {

			lh.add(w.charAt(i));

		}
		for (Character ch1 : lh) {
			// System.out.print(ch1 + " ");
			int count = 0;
			for (int i = 0; i < w.length(); i++) {
				
				if (ch1 == w.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch1 + " " + count);

		}
	}
}
