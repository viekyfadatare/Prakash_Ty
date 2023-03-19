package TetsYantra;


public class aabbbccccaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		String s = "aabbbccccaa";


		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			
			int count = 1;
			
			for (int j = i+1; j < s.length(); j++) {

				if(ch==s.charAt(j)) {
					count++;
					i++;
				}else {
					
					break;
				}
			}
			
			System.out.print(ch+""+count);

		}
	}

}