package kcy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Programers_string_sort_my_mind {

	public static void main(String[] args) {

		String[] arr = {"sun", "bed", "car"};
		int n = 1;
		
		System.out.println(Arrays.toString(solution(arr,n)));
		
	}

    public static String[] solution(String[] str, int n) {
		String[] answer = {};
		List<String> al = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			al.add(str[i].charAt(n) + str[i]);
		}
		Collections.sort(al);
		answer = new String[al.size()];

		int i = 0;
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			answer[i] = it.next().substring(1, al.get(i).length());
			i++;
		}

		return answer;
	}
}
