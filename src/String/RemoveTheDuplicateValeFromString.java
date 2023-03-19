package String;

import java.util.HashSet;

// remove duplicate using HashSet
public class RemoveTheDuplicateValeFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "my name is raj gupta and i am here for automation ";

		HashSet set = new HashSet<String>();

		for (int i = 0; i < s.length(); i++) {

			set.add(s.charAt(i));

		}

		for (Object object : set) {
			System.out.println(object);
		}

	}

}
