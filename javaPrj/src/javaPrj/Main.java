package javaPrj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		
		int i = 1;
		int j = 0;
		int k = 1;

	
		
		while(i <= a) {
			
			if(i <= 10) {
				if(i == 2 || i == 3 || i == 5 || i == 7) {
					k++;
					System.out.println(k + "1번");
				}
			} 
			
			if(i >= 10){
				if(a % 2 != 0 && a % 3 != 0 && a % 5 != 0 && a % 7 != 0 ) {
					k++;
					System.out.println(k + "2번");
				}
			}
				
			i++;
					
		}
		*/
		
		
		
		int k= 0;
		
		int [] a = new int [20];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 4;
			System.out.println(a[i]);
			
			if(a[i] % 2 != 0) {
				if(a[i] % 3 != 0) {
					if(a[i] % 5 != 0) {
						if(a[i] % 7 != 0) {
							k++;
						}
					}
				}
			}
		}
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		//System.out.println(k-1);
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();

		
		int i = 1;
		int hap = 0;
		while(i <= a) {
			if(a % i ==0) {
				hap += i;
			}
		i++;
		}
		
		System.out.println(hap);
		*/
		/*
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		String [] t = new String[a];
		int i = 0;
		
		while(i < a) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			t[i] = String.valueOf(b + c);
			i++;
		}
		
		i = 0;
		
		while(i < a) {
			System.out.println(t[i]);
			i++;
		}
		*/
		/*
		Scanner scan = new Scanner(System.in);
		
		String num2 = scan.nextLine();
		String[] arr = num2.split(" ");
		int t = 0;
		String a = arr[0];
		int b = Integer.parseInt(a);
		
		while(t <= b) {
			num2 = scan.nextLine();
			arr = num2.split(" ");
			
			// 배열의 갯수
			int cnt = arr.length;

			if (cnt > 1) {

				String g = arr[0];
				String f = arr[0];

				int d = 0;
				int e = 0;


				int n1 = Integer.parseInt(arr[0]);
				int n2 = Integer.parseInt(arr[1]);

				System.out.println(n1 + "+" + n2 + "= " + (n1 + n2));

			}
			
			t++;
		}
		*/
		//System.exit(1);

		


		/*
		 * for(int i = 1, k = 2; i - 1 <= b; i += 2, k += 2) { 
		 * g = arr[i]; 
		 * f = arr[k]; 
		 * d = Integer.parseInt(g); 
		 * e = Integer.parseInt(f); 
		 * System.out.printf("%d", d +e); }
		 */

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int a = scan.nextInt(); int b = 1;
		 * 
		 * for(int i = a; i == a; i++) { for(int k = 1; k <= 9; k++) {
		 * System.out.printf("%d * %d = %d\n", i, k, i * k); } }
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int a = scan.nextInt(); int b = scan.nextInt(); int c;
		 * 
		 * c = b - 45;
		 * 
		 * if(c < 0) { a -= 1; if(a < 0) { System.out.printf("%d %d", 24 + a, 60 + c); }
		 * else { System.out.printf("%d %d", a, 60 + c); } } else {
		 * System.out.printf("%d %d", a, c); }
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int a = scan.nextInt(); int b = scan.nextInt();
		 * 
		 * if(a > 0) { if(b > 0) { System.out.println("1"); } else {
		 * System.out.println("4"); }
		 * 
		 * } else { if(b > 0) { System.out.println("2"); } else {
		 * System.out.println("3"); } }
		 */

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int a = scan.nextInt();
		 * 
		 * 
		 * if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) { System.out.println("1");
		 * } else { System.out.println("0"); }
		 */

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int a = scan.nextInt();
		 * 
		 * if(a >= 90) { System.out.println("A"); } else if (90 > a && a >= 80) {
		 * System.out.println("B"); } else if(80 > a && a >= 70) {
		 * System.out.println("C"); } else if(70 > a && a >= 60) {
		 * System.out.println("D"); } else { System.out.println("F"); }
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int a = scan.nextInt(); int b = scan.nextInt();
		 * 
		 * if(a > b) { System.out.print(">"); } else if(a == b) {
		 * System.out.print("=="); } else if(a < b) { System.out.print("<"); }
		 */

	}

}
