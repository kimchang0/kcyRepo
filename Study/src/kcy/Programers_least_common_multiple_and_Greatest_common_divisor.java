package kcy;

import java.util.Arrays;

public class Programers_least_common_multiple_and_Greatest_common_divisor {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(3, 12)));

	}

	public static int[] solution(int n, int m) {
		int[] answer = new int[2];

		answer[0] = gcd(n, m);
		answer[1] = lcm(n, m);

		return answer;
	}

	public static int gcd(int a, int b) { // 최대공약수
		int i = 1;
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
			i++;
		}
		return a;
	}

	public static int lcm(int a, int b) { // 최소 공배수
		// 0이 아닌 두 수의 곱 / 두 수의 최대공약수
		return a * b / gcd(a, b);
	}

}
