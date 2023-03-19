package String;
// Reverse the Strin wthout usingb lenght()
public class Reverserse_the_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s = "My name is Vieky";

		char[] s1 = s.toCharArray();
		int count = 0;
		for (char c : s1) {
			count++;
		}
		System.out.println(count);
		for (int i = count-1; i >=0; i--) {
			System.out.print(s1[i]);
		}*/
		
		String s = "I am Vikasratna Somnath Fadatare";
		
		
		char [] ch = s.toCharArray();
		int count = 0;
		for (char c : ch) {
			
			count++;
			}
		
		System.out.println("lenght of String is:==="+count);
		for (int i = ch.length-1; i >=0; i--) {

			System.out.print(ch[i]);
			
		}

	}

}
