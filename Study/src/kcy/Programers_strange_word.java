package kcy;

import java.util.Arrays;

public class Programers_strange_word {

	public static void main(String[] args) {
		
		System.out.println(solution("try hello world"));
		
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
			if(arr[i] == " ") {
				s_is_even = true;
			} else {
				s_is_even = !s_is_even;
			}
			
			answer += arr[i];
			
		}

		return answer;
	}
}
