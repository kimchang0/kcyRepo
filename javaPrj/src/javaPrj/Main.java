package javaPrj;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		Scanner scan = new Scanner(System.in);
		

		int [] a = new int [3];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println(a[1]);
		
		
		
		
		/*
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a > b && a > c && b > c ) {
			System.out.println(b);
		} else if(a > b && a > c && c > b ) {
			System.out.println(c);
		} else if(b > a && b > c && a > c ) {
			System.out.println(a);
		} else if(b > a && b > c && c > a ) {
			System.out.println(c);
		} else if(c > a && c > b && a > b ) {
			System.out.println(a);
		} else if(c > a && c > b && b > a ) {
			System.out.println(b);
		} else if(b == c && b > a) {
			System.out.println(a);
		} else if(a == b && b > c) {
			System.out.println(c);
		} else if(a == c && a > b) {
			System.out.println(b);
		} else if(a == b || b == c) {
			System.out.println(a);
		}
		*/
		
		
		
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int a [] = new int [5];
		int b = 3000;
		int c = 3000;

		
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		for(int k = 0; k < 3; k++) {
			if(b > a[k]) {
				b = a[k];
			}
		}
		for(int j = 3; j < 5; j++) {
			if(c > a[j]) {
				c = a[j];
			}
		}
		System.out.println((c + b - 50));
		*/
		/*
		Scanner scan = new Scanner(System.in);
		
		 int a = 0;
		 int sum = 0;
		 int b = 0;
		 
		 while(b < 5) {
			 a = scan.nextInt();
			 if(a < 40) {
				 a = 40;
			 }
			 sum += a;
			 b++;
		 }
		sum = sum / 5;
		System.out.println(sum);
		*/
		/*
		Scanner scan = new Scanner(System.in);
		
		 int a = scan.nextInt();
	      if (a < 10) {
	         a *= 10;
	      }
	      int one = a / 10;
	      int two = a % 10;
	      int save;
	      int count = 0;
	      while (true) {
	         count++;
	         save = two;
	         two = (one + two) % 10;
	         one = save;
	         if (a == ((one * 10) + two)) {
	            break;
	         }
	      }
	      System.out.println(count);
		 */
		/*
		int a = scan.nextInt();
		int c = 0;
		int d = a;
		int b = a;
		int count = 0;
		
		if(a < 10) {
			a = a * 10;
		}
		
			while(true) {
			b = a;
			System.out.println("1 b = "+b);
			
			if(b == 10) {
				b = 1;
			} else {
				b = b % 10;
			}
			

			System.out.println("b = " + b);
			a = a - (a % 10);
			a = a / 10;
			System.out.println("a = " + a);
			
			if(a + b >= 10) {
				a = b * 10 + (b + a) % 10;
			} else {
				a = b * 10 + b + a;
			}
	
			
			count++;
			if(a == d) {
				break;
			}
			if(count == 60) {
				break;
			}
		}
		
		System.out.println("count = " + count);
		*/
		
	
	/*
	Scanner scan = new Scanner(System.in);
		
		
	while(scan.hasNextInt()) {
		int a = scan.nextInt();
		int b = scan.nextInt();
			
		System.out.printf("%d\n",a+b);
	}
	*/
	/*
	Scanner scan = new Scanner(System.in);

	int i = 1;
	while(i != 5000) {
		int b = scan.nextInt();
			int c = scan.nextInt();
			int k = b + c;
			if(k != 0) {
		System.out.println(k);			
		} else {
			break;
		}
			i++;
	}
	*/
		/*
		Scanner scan = new Scanner(System.in);

		int i = 1;
		while(i != 0) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			int k = b + c;
			if(k != 0) {
			System.out.println(k);
			} else {
				break;
			}
			i++;
		}
		*/
		/*
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int i = 1;
		while(i <= a) {
			int c = scan.nextInt();
			if(c < b) {
			System.out.printf("%d ", c);
			}
			
			i++;
		}
		*/
		/*
		Scanner scan = new Scanner(System.in);
		

		int a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int k = 1; k <= a; k++) {
				if(i+k <= a) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		/*
		Scanner scan = new Scanner(System.in);
		

		int a = scan.nextInt();
		int i = 1;
		

		
		while(i <= a) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			int k = b + c;
			System.out.println("Case #"+i+": " + b + " + " + c + " = " + k);
			
			i++;
		}
		*/
		/*

		Scanner scan = new Scanner(System.in);
		

		int a = scan.nextInt();
		int i = 1;
		

		
		while(i <= a) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			int k = b + c;
			System.out.println("Case #"+i+": "+k);
			
			i++;
		}
		*/
		/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int rep = Integer.parseInt(br.readLine());
        String b = "";
        
        int[] z = new int[rep];
        
        for(int i = 0; i < rep; i++) {
           
           b = br.readLine();
           String[] d = b.split(" ");
           String c = d[0];
           String e = d[1];
           
           int x = Integer.parseInt(c);
           int y = Integer.parseInt(e);
           z[i] = x + y;
           
        }
        
        for(int i=0; i<rep; i++)
      {
         bw.write(z[i]+"");
         bw.newLine();
      }
        
        bw.flush();
        bw.close();
      */
 
   

			
			
			
			
			
		
		/*
		int a = 121; 
		int d [] = new int [a]; 
		
		for(int i = 0; i < d.length; i++) { 
			d[i] = i + 1;
		}
		
		int k = 0;
		int j = 2; 
		int y = 0; 
		int h = -1;

		while(k < d.length) { 
			while(j < d[k]) { 
				y = 0;
				if(d[k] % j == 0) { 
					if(d[k] != j) {
						y++; 
					}
					break;
				} 
				j++; 
			}
			if(y==0) {
				h++;
			}
			k++; 
			j = 2; 
		}
		System.out.println(h);
*/

		
		
		
		
		/*
		
		Scanner scan = new Scanner(System.in);
		
		int [] d = new int [10]; // 배열공간 10 선언
		int k = 0; //int형 변수 k = 0 선언
		
		for(int i = 0; i < 5; i++) {// d 배열에 숫자 입력
		d[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {// d 배열 오름차순 정렬
			for(int j = i + 1; j < 5; j++) {
				if(d[i] > d[j]) {
					int temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		
		int budget = scan.nextInt();// budget 선언 및 입력
		
		for(int i = 0; i < d.length; i++) {// budget에서 원하는 수 작은 순서대로 뺌(가장 많은 부서에 나눠주기 위해)
			int t = d[i];
			if(budget < t) {// 남은 금액보다 뺄 금액이 크면 포문 종료
				break;
			}
			budget -= d[i]; // budget에서 d[i]만큼 뺌
			k++; //부서에 나눠준 횟수
		}
		
		System.out.println("last k =" + k); // 나눠준 횟수 표현
		*/

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
