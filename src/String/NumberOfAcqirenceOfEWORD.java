package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

// to acuring the number of word from given string
public class NumberOfAcqirenceOfEWORD {

	public static void main(String[] args) {
		String s = "Hello Anna Hello Akka Hello Appa Anna";

		String[] sarr = s.split(" ");

		System.out.println("Number of Element In Array ====>  " + sarr.length);

		System.out.println();
		System.out.println("=================================================================================");
		System.out.println();

	//	LinkedHashSet<String> lh = new LinkedHashSet<String>();

		HashSet<String> lh = new HashSet<String>();
		
		for (String word1 : sarr) {
		lh.add(word1);
		}
		System.out.println(lh);
		// this is loop for iterate array
		for (String word2 : lh) {
			int count = 0;
			for (String word3 : sarr) {
				if (word2.equals(word3)) {
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(word2 + "   Number of count ======  " + count);
			}
		}
	}
}
