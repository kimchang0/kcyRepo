package javaPrj;

import java.util.Scanner;

public class answerCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ����?");
		int a = scan.nextInt();
		int count = 0;
		
		int prob [] = new int [a];
		int answer [] = new int [a];
		
		System.out.println("������ �Է��ϼ���.");
		for(int i = 0; i < prob.length; i++) {
			prob[i] = scan.nextInt();
		}
		
		System.out.println("������ ���� �Է��ϼ���.");
		for(int i = 0; i < answer.length; i++) {
			answer[i] = scan.nextInt();
		}
		System.out.println();
		for(int i = 0; i < answer.length; i++) {
			if(prob[i] != answer[i]) {
				System.out.println((i+1) + "�� ���� Ʋ��");
				System.out.println((i+1) + "�� ���� " + prob[i]);
				System.out.println("���� ������ "+ (i+1) + "�� ���� " + answer[i]);
				count++;
			} else {
				System.out.println((i+1) + "�� ����" );
			}
			
		}
		System.out.println(a + "���߿� " + count + "���� Ʋ��");
		System.out.println("������� "+(100 - ((float) count /(float) a) * 100) + "%");
		
		
		
		
		
		

	}

}
