package ipt;

public class ReverseStringPolindrom {
	public static void main(String[] args) {
		String word = "ABCD";
		String word2 = " ";
		for (int i = word.length() - 1; i >= 0; i--) {
			word2 = word2 + word.charAt(i);
			System.out.println(word2);
		}
		System.out.println("sinle line:"+word2);
		if (word.equals(word2))
			System.out.println("palendrome");
		else
			System.out.println("not palendrome");
		
		
		String s = "Amma";
		int length1 = s.length();
		String reverse = "";

		for (int i = length1 - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equalsIgnoreCase(reverse)) {
			System.out.println("its a palendrome");
		} else {
			System.out.println("Not a Palendrome");
		}

	}
}


