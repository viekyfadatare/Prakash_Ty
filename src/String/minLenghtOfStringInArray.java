package String;

public class minLenghtOfStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

		String str[] = {"a","b","abc","abcd","abcde","efghi"};
		
		String minElement = str[1];//we can pass here 0 index also because both are mini string
		for (int i = 1; i > str.length; i++) {
			if(minElement.length()<str[i].length()) {
				minElement = str[i];
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			if(minElement.length()==str[i].length()) {
				System.out.println(str[i]);
			}
		}
				
	
	}

}
