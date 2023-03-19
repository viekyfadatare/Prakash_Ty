package String;

public class GetSumOFGRoupOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a12b13b30d50";

		int sum = 0;
		int Tsum = 0;

		
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

				int n = s.charAt(i) - 48; // 48 is the aski value of String

				sum = sum * 10 + n;

			} else {

				Tsum = Tsum + sum;

				sum = 0;
			}
		}
		System.out.println(Tsum+sum);

	}
}
