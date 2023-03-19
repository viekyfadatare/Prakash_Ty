package Practice;

public class SubStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "sum";
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 1; j <= s.length(); j++) {
				
				System.out.println(s.substring(i, j));
				
			}
			
			break;
		}

	}

}
