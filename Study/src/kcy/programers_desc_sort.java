package kcy;

import java.util.Arrays;

public class programers_desc_sort {

	public static void main(String[] args) {
		
		String s = "asdasdASD";
		String answer = "";
		String[] array = s.split("");
		Arrays.sort(array);
		for (int i = s.length() - 1; i >= 0; i--) {
			answer += array[i];
		}
		System.out.println(answer);
	}
	
}
