package kcy;

public class programers_string_sort {

	public static void main(String[] args) {

		String a = "1234";
		boolean STRING_IS_NUMBER = a.matches("^[0-9]*$");
		boolean STRING_IS_4_OR_6 = false;

		if(a.length() == 4 || a.length() == 6) {
			STRING_IS_4_OR_6 = true;
		}
		if(STRING_IS_NUMBER == true && STRING_IS_4_OR_6 == true) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	
	}

}
