package String;

public class LetterReverseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to TY";
		
		String strarr [] = str.split(" ");
		
		for (int i = 0; i < strarr.length; i++) {
			String s = strarr[i];
			
			for (int j = s.length()-1; j >=0; j--) {
				
				System.out.print(s.charAt(j));	
			}
			System.out.print(" ");
		}

	}

}
