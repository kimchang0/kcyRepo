package kcy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers_failure_rate {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 2, 6, 2, 4, 3, 3 };
		System.out.println(Arrays.toString(solution(5, arr)));

	}

	public static int[] solution(int N, int[] stages) {

		int[] answer = new int[N];
		double[] stage = new double[N + 1]; // ������������ �ӹ��� �ִ� ����ڼ��� ���� �迭

		// stage�迭�� �ӹ����ִ� ����ڼ��� ��´� , �ε������� ����������ȣ
		for (int i : stages) {
			if (i == N + 1) {
				continue;
			}
			stage[i]++;
		}
		// �������� ����� ���� list
		ArrayList<Double> fail = new ArrayList<Double>();
		// ���������� ������ ���
		double num = stages.length;
		// ���� ���������� �ö󰥶� �پ��� ����ڼ��� ����ϱ� ���� ���
		double tmp = 0;
		// �������� ���� �� �ٽ� stage�迭�� ���, fail ����Ʈ���� ����ش�.
		for (int i = 1; i < stage.length; i++) {
			tmp = stage[i];
			// ������ ����� ���� 0 �϶�, �������� 0
			if (num == 0) {
				stage[i] = 0;
			} else {
				stage[i] = stage[i] / num;
				num = num - tmp;
			}
			fail.add(stage[i]);
		}

		// fail ����Ʈ�� ������������ �������ش�.
		Collections.sort(fail, Collections.reverseOrder());
		// ���ĵ� fail����Ʈ ���� stage���� ���ؼ� ������ stage�� �ε�����ȣ(����������ȣ)�� ���������ν�
		// �������� ���� ������ answer�迭�� �־��ش�.
		for (int i = 0; i < fail.size(); i++) {
			for (int j = 1; j < stage.length; j++) {
				if (fail.get(i) == stage[j]) {
					answer[i] = j;
					stage[j] = -1;
					break;
				}
			}
		}
		return answer;

	}
}
