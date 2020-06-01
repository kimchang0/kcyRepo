package javaPrj;

import java.io.IOException;
import java.util.Scanner;

public class Study {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int a, b;
		char ch;

		while (true) {
			System.out.printf("더할 첫 수를 입력하십시오: ");
			a = scan.nextInt();
			System.out.printf("더할 두번 째 수를 입력하십시오: ");
			b = scan.nextInt();
			System.out.printf("계산할 연산자를 입력하십시오: ");
			ch = (char) System.in.read();

			switch (ch) {
			case '+':
				//System.out.printf("%d + %d = %d 입니다. \n", a, b, a + b);
				System.out.println(a + "+" + b + "=" + (a + b) + "입니다.");
				break;
			case '-':
				System.out.printf("%d - %d = %d 입니다. \n", a, b, a - b);
				break;
			case '*':
				System.out.printf("%d * %d = %d 입니다. \n", a, b, a * b);
				break;
			case '/':
				System.out.printf("%d / %d = %d 입니다. \n", a, b, a / b);
				break;
			case '%':
				System.out.printf("%d % %d = %d 입니다. \n", a, b, a % b);
				break;
			default:
				System.out.printf("연산자를 잘 못 입력했습니다. \n");
				break;
				
			}

		}
		
		

	}

}
