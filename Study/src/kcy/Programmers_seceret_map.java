package kcy;

import java.util.Arrays;

public class Programmers_seceret_map {

	public static void main(String[] args) {

		// Integer.Binary 2진수 변환, toString으로 변환, split으로 나누고, 같으면 # 아니면 " "
		int[] arr1 = { 46, 33, 33 ,22, 31, 50 };
		int[] arr2 = { 27 ,56, 19, 14, 14, 10 };
		int n = 6;
		System.out.println(Arrays.toString(solution1(n, arr1, arr2)));
		
		//다른 사람의 풀이는 공간복잡도는 좋지만 시간복잡도가 안좋고
		//내 풀이는 공간복잡도는 안좋지만 시간복잡도가 좋다.
		//둘 다 해결할 솔루션 생각해보자
	}
	//다른 사람의 풀이
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		}

		for (int i = 0; i < n; i++) {
			answer[i] = String.format("%" + n + "s", answer[i]);
			answer[i] = answer[i].replaceAll("1", "#");
			answer[i] = answer[i].replaceAll("0", " ");
		}

		return answer;
	}
	//내 풀이
	public static String[] solution1(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		boolean[] map1 = new boolean[n];
		boolean[] map2 = new boolean[n];

		for (int i = 0; i < arr1.length; i++) {

			String temp1 = Integer.toBinaryString(arr1[i]);
			String temp2 = Integer.toBinaryString(arr2[i]);
			if (temp1.length() <= n) {
				for (int j = temp1.length(); j < n; j++) {
					temp1 = "0" + temp1;
				}
			}
			if (temp2.length() <= n) {
				for (int j = temp2.length(); j < n; j++) {
					temp2 = "0" + temp2;
				}
			}
			String[] array1 = temp1.split("");
			String[] array2 = temp2.split("");
			for (int j = 0; j < array1.length; j++) {
				if (array1[j].equals("1")) {
					map1[j] = true;
				} else {
					map1[j] = false;
				}

				if (array2[j].equals("1")) {
					map2[j] = true;
				} else {
					map2[j] = false;
				}
				if (j == 0) {
					if (map1[j] == true || map2[j] == true) {
						answer[i] = "#";
					} else {
						answer[i] = " ";
					}
				} else {
					if (map1[j] == true || map2[j] == true) {
						answer[i] += "#";
					} else {
						answer[i] += " ";
					}
				}
			}

		}
		return answer;
	}

}
