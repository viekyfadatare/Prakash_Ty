package String;

import java.util.LinkedHashSet;

public class Arraylist {

	public static void main(String[] args) {
		
		String s = "aabbccddz";
		
		
		
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
		lh.add(s.charAt(i));
			
		}
		
		
		for (Character ch : lh) {
			
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
				
				
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			
			if(count>1) {
				
				System.out.println(ch+"  Is a duplicate");
			}else {
				System.out.println(ch+"  Is not duplicate");
			}
			
		}
		

	}
	
	
}
