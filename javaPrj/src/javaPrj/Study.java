package javaPrj;

import java.io.IOException;
import java.util.Scanner;

public class Study {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int a, b;
		char ch;

		while (true) {
			System.out.printf("���� ù ���� �Է��Ͻʽÿ�: ");
			a = scan.nextInt();
			System.out.printf("���� �ι� ° ���� �Է��Ͻʽÿ�: ");
			b = scan.nextInt();
			System.out.printf("����� �����ڸ� �Է��Ͻʽÿ�: ");
			ch = (char) System.in.read();

			switch (ch) {
			case '+':
				//System.out.printf("%d + %d = %d �Դϴ�. \n", a, b, a + b);
				System.out.println(a + "+" + b + "=" + (a + b) + "�Դϴ�.");
				break;
			case '-':
				System.out.printf("%d - %d = %d �Դϴ�. \n", a, b, a - b);
				break;
			case '*':
				System.out.printf("%d * %d = %d �Դϴ�. \n", a, b, a * b);
				break;
			case '/':
				System.out.printf("%d / %d = %d �Դϴ�. \n", a, b, a / b);
				break;
			case '%':
				System.out.printf("%d % %d = %d �Դϴ�. \n", a, b, a % b);
				break;
			default:
				System.out.printf("�����ڸ� �� �� �Է��߽��ϴ�. \n");
				break;
				
			}

		}
		
		

	}

}
