package kcy;

public class Programmers_Recommend_new_ID {

	public static void main(String[] args) {

		String str = "";
		System.out.println(solution(str));

	}

	public static String solution(String new_id) {

		new_id = new_id.toLowerCase().replaceAll("[^0-9a-z._-]", "").replaceAll("\\.\\.*", ".").replaceAll("^\\.", "").replaceAll("\\.$", "");
		if(new_id.equals("") || new_id.equals(" ")) {
			new_id = "a";
		}
		if(new_id.length() > 15) {
			new_id = new_id.substring(0,15);
		}
		new_id = new_id.replaceAll("\\.$", "");
		if(new_id.length() <= 2) {
			while(true) {
				new_id += new_id.substring(new_id.length()-1);
				if(new_id.length() == 3) {
					break;
				}
			}
		}
		
		return new_id;
	}
}
