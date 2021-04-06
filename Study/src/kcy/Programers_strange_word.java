package kcy;


public class Programers_strange_word {

	public static void main(String[] args) {

		System.out.println(solution2("try hello world"));

	}

	public static String solution(String s) {

		boolean s_is_even = true;
		String[] arr = s.split("");
		String answer = "";
		for (int i = 0; i < arr.length; i++) {

			if (s_is_even) {
				arr[i] = arr[i].toUpperCase();
			} else {
				arr[i] = arr[i].toLowerCase();
			}
			if (arr[i].equals(" ")) {
				s_is_even = true;
			} else {
				s_is_even = !s_is_even;
			}

			answer += arr[i];
		}
		return answer;
	}
	
	public static String solution2(String s) {
		String answer = "";
		String[] st = s.split("");
		int cnt = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i].equals(" ")) {
				cnt = 0;
			} else if (cnt % 2 == 0) {
				st[i] = st[i].toUpperCase();
				cnt++;
			} else {
				st[i] = st[i].toLowerCase();
				cnt++;
			}
			answer += st[i];
		}
		return answer;
	}
}
