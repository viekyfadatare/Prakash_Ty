package TetsYantra;

import java.util.LinkedHashSet;

public class Tets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aabbbccccaa";
		
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s1.length(); i++) {
			
			set.add(s1.charAt(i));
	
		}
		for (char ch : set) {
			
			int count = 0;
			
			
			for (int i = 0; i < s1.length(); i++) {
				
				if(ch==s1.charAt(i)) {
					
					count++;
				}
				
				
			}
			System.out.print(ch+""+count);
		}

	}

}
