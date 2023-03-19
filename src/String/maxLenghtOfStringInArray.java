package String;

public class maxLenghtOfStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"a","b","abc","abcd","abcde","efghi"};
		
		String maxElement = str[0];
		for (int i = 1; i < str.length; i++) {
			if(maxElement.length()<str[i].length()) {
				maxElement = str[i];
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			if(maxElement.length()==str[i].length()) {
				System.out.println(str[i]);
			}
		}
				
	}

}
