package javaPrj;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello java!");
		 Scanner scan = new Scanner(System.in);

	      double row = 1;
	      double col = -1;

	      while (Math.pow((row - col), 2) > 1) {
	         System.out.println("��� ���� ���� �������� �ʽ��ϴ�.");
	         System.out.println("���� ���� �Է�");
	         row = scan.nextInt();
	         System.out.println("���� ���� �Է�");
	         col = scan.nextInt();
	      }

	      System.out.println("row : " + row + ", col : " + col);
	      System.out.println("--------------------------------");

	      for (int i = 1; i <= row; i++) {
	         for (int j = 1; j <= col; j++) {
	            if (i <= (row / 2)) {
	               System.out.print((((col / 2) - i + 1 <= j) && ((col / 2) + i >= j)) ? "*" : " ");
	            } else {
	               System.out.print(((i - (col / 2) <= j) && ((3 * col / 2) - i + 1 >= j)) ? "*" : " ");
	            }
	         }
	         System.out.println();
	      }

	   }

	}


