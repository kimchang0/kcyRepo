package javaPrj;

import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int res;
		int oper, a, b;
		
		System.out.println("����Է� (1:+, 2:-, 3:*, 4:/) :");
		oper = scan.nextInt();
		
		System.out.println("ù��° ���ڸ� �Է� : ");
		a = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է� : ");
		b = scan.nextInt();
		
		res = calc(a, b, oper);
		
		System.out.println("��� ����� :" + res);
		

	}
	
	
	
	static int calc(int v1, int v2, int op) {
		
		int result;
		
		switch (op) {
		case 1: result = v1 + v2; break;
		case 2: result = v1 - v2; break;
		case 3: result = v1 * v2; break;
		case 4: result = v1 / v2; break;
		default: result = 0;
		}
		
		
		
		return result;
	}

}
