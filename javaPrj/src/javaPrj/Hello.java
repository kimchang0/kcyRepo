package javaPrj;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
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
	      */
		/*
		  for(int i = 1; i <= 11; i++) {
              for(int j = 1; j <= 6; j++) {
                 if(i <= 6) {
                   System.out.print((6 - i <= j-1) ? "*" : " "); 
                 } else {
                   System.out.print((i - 6 <= j-1) ? "*" : " ");
                 }
              }
             System.out.println();
           }
		*/
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i <= 4) {
					 System.out.print((7 - i <= j) ? " " : "*");
					 
				} else {
					
				}
			}
			
			for(int k = 1; k <= 5; k++) {
				if(i <= 4) {
					 System.out.print((i <= k) ? "*" : " ");
					 
				} else {
					
				}
			}
			
			System.out.println();
		}
		for(int i = 1; i <= 7; i++) {
			for(int k = 1; k <= 5; k++) {
				if(i <= 4) {
					 System.out.print((i <= k) ? " " : "*");
					 
				} else {
					
				}
			}
			for(int j = 1; j <= 5; j++) {
				if(i <= 4) {
					 System.out.print((7 - i <= j) ? "*" : " ");
					 
				} else {
					
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	   }

}


