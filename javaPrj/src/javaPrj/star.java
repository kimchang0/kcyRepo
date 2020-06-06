package javaPrj;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a; j++) {
				System.out.print(j <= a - i ? " " : "*");
			}
			System.out.println();
		}
		
		
		/*
		int i, j;

		
		for(i = 3; i <= 8; i++) {
			if(i==3||i==5){
				System.out.println("<"+i+"´Ü>");
			}
				for(j = 1; j <= 9; j++) {
					int ans = i * j;
					System.out.printf(i+"*"+j+"="+ans);
				}
				System.out.println();
			}
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
		
		
		
}


