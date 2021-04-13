package kcy;

public class Programers_harshad_number {

	public static void main(String[] args) {

		System.out.println(solution(11));

	}

	public static boolean solution(int x) {

		String str = Integer.toString(x);
		String[] split = str.split("");
		int division_num = 0;

		for (int i = 0; i < split.length; i++) {
			division_num += Integer.parseInt(split[i]);
		}

		if (x % division_num == 0) {
			return true;
		} else {
			return false;
		}
	}

}
