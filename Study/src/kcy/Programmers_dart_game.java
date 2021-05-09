package kcy;

import java.util.Arrays;

public class Programmers_dart_game {

	public static void main(String[] args) {

		System.out.println(solution("1D2S3T*"));

	}

	public static int solution(String dartResult) {
		int[] last_score = new int[3];
		String[] arr = dartResult.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("S")) {
				arr[i] = "x1 ";
			} else if (arr[i].equals("D")) {
				arr[i] = "x2 ";
			} else if (arr[i].equals("T")) {
				arr[i] = "x3 ";
			} else if (arr[i].equals("*")) {
				arr[i] = "* ";
			} else if (arr[i].equals("#")) {
				arr[i] = "# ";
			}
		}
		String temp = String.join("", arr);
		arr = null;
		arr = temp.split(" ");
		temp = null;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			String[] numbers = arr[i].split("x");
			int temp_num = 1;

			if (numbers[0].equals("*")) {
				if (k-1 == 0) {
					last_score[k-1] *= 2;
				} else {
					last_score[k - 2] *= 2;
					last_score[k - 1] *= 2;
				}
			} else if (numbers[0].equals("#")) {
				last_score[k - 1] *= -1;
			}
			if (!(numbers[0].equals("*") || numbers[0].equals("#"))) {
				for (int j = 1; j <= Integer.parseInt(numbers[1]); j++) {
					temp_num *= Integer.parseInt(numbers[0]);
				}
				last_score[k] = temp_num;
				k++;
			}

		}
		return last_score[0] + last_score[1] + last_score[2];
	}

}
