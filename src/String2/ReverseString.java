package String2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcd efg";
	//	s.charAt(0);
		String rev = "";

		//int i = s.length() - 1; i >= 0; i--
		for (int i = s.length()-1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}

		System.out.println(rev);
	}

}
