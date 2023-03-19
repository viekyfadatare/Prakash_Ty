package String;

// reverse the string without using lenght()
public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String s = "My name is Vieky";
		 * 
		 * //char[] s1 = s.toCharArray();
		 * 
		 * String [] s1 = s.split("");
		 * 
		 * for (int i = s1.length - 1; i >= 0; i--) {
		 * 
		 * System.out.print(s1[i]);
		 * 
		 * }
		 */
		String s = "MY name Is Shashi";

		String[] s1 = s.split(" ");

		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.println(s1[i]);
		}

	}

}
