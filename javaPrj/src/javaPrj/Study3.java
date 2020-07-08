package javaPrj;

import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int res;
		int oper, a, b;
		
		System.out.println("계산입력 (1:+, 2:-, 3:*, 4:/) :");
		oper = scan.nextInt();
		
		System.out.println("첫번째 숫자를 입력 : ");
		a = scan.nextInt();
		System.out.println("두번째 숫자를 입력 : ");
		b = scan.nextInt();
		
		res = calc(a, b, oper);
		
		System.out.println("계산 결과는 :" + res);
		

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
