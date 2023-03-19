package String;

import java.util.LinkedHashSet;

public class LinkeedHashsetToRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbccdeefgg   hh";
		
		LinkedHashSet lh = new LinkedHashSet<String>();
		
		for (int i = 0; i < s.length(); i++) {
			
			lh.add(s.charAt(i));
		}
		
		for (Object object : lh) {
			System.out.print(object);
		}
	

	}

}
