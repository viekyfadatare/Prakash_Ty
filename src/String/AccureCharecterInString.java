package String;

// cheach the charecter of repeatavity in the given String
import java.util.LinkedHashSet;

public class AccureCharecterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbcrrrrrrrrrrrcddecaerr";

		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {

			lh.add(s.charAt(i)); 
		}

		for (Character ch1 : lh) {
			int count = 0;

			for (int i = 0; i < s.length(); i++) {

				if (ch1 == s.charAt(i)) {

					count++;
				}
			}
			System.out.println(ch1 + " === " + count);
		}

	}

}
