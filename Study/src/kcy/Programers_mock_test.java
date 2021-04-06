package kcy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programers_mock_test {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 3, 2, 4, 2 };
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));    
	}
	
    public static int[] solution(int[] answers) {
		int[] answer = {};
		int[] man1 = { 1, 2, 3, 4, 5 };
		int[] man2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] man3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] count = new int[3];

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == man1[i % 5]) {
				count[0]++;
			}
			if (answers[i] == man2[i % 8]) {
				count[1]++;
			}
			if (answers[i] == man3[i % 10]) {
				count[2]++;
			}
		}

		int max = count[0];
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
			}
		}

		List<Integer> rList = new ArrayList<>();
		if (max == count[0]) {
			rList.add(1);
		}
		if (max == count[1]) {
			rList.add(2);
		}
		if (max == count[2]) {
			rList.add(3);
		}

		answer = new int[rList.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = rList.get(i);
		}
		return answer;
	}

}
