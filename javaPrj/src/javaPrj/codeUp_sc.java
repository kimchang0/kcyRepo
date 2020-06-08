package javaPrj;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.IOException;
public class codeUp_sc {

	public static void main(String[] args) {
		
		
		
/*	
Scanner sc = new Scanner(System.in);
        
String str = sc.nextLine();
           
int a = Integer.parseInt(str,16);
        
String ans = Integer.toOctalString(a);
        
System.out.print(ans);

2진수->10진수 Integer.toBinaryString(int);
8진수->10진수 Integer.toOctalString(int);
16진수->10진수 Integer.toHexString(int);
10진수->2진수 Integer.valueOf(string, 2)
10진수->8진수 Integer.valueOf(string, 8)
10진수->16진수 Integer.valueOf(string, 16)

문자열->?(2,8,10,16)진수 변환 (int형)
Integer.parseInt(str,?);

문자열->?(2,8,10,16)진수 변환 (long형)
long b = Long.parseLong(str);
*/

		
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		 
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		
		long a = Long.parseLong(v);
		long b = Long.parseLong(w);
		
		System.out.printf("%d", a+b);
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		 
		long a = Long.parseLong(str);
		
		System.out.printf("%d", -a);
		*/
		
		/*
		char a;
		Scanner scan = new Scanner(System.in);
		a = scan.next().charAt(0);
		int t = (int)a+1;
		System.out.println( (char)t );
		*/
		
		
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		
		long a = Long.parseLong(v);
		long b = Long.parseLong(w);
		float c = (float)a/(float)b;
		
		System.out.printf("%d\n", a+b);
		System.out.printf("%d\n", a-b);
		System.out.printf("%d\n", a*b);
		System.out.printf("%d\n", a/b);
		System.out.printf("%d\n", a%b);
		System.out.printf("%.2f\n", c);
		*/
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		String x = dd[2];
		
		long a = Long.parseLong(v);
		long b = Long.parseLong(w);		
		long c = Long.parseLong(x);
		
		float d = ((float)a+b+c)/3;
		
		System.out.printf("%d\n", a+b+c);
		System.out.printf("%.1f\n", d);
		*/
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		
		long a = Long.parseLong(v);
		long b = Long.parseLong(w);
		//long c = (long)Math.pow(2,b);
		
		System.out.printf("%d", a*((long)Math.pow(2,b)));
		*/
		
		//이중와일 구구단
		/*
		int i = 2;
		int j;
		
		while (i <= 9) {
			j=1;
			while(j <= 9) {
				System.out.printf("%d * %d =%d\n", i, j, i * j);
				j++;
			}
			System.out.println();
			
			i++;
		}
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		
		long a = Long.parseLong(v);
		long b = Long.parseLong(w);
		
		System.out.printf((a>b) ? "1" : "0");
		*/
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		
		long a = Long.parseLong(v);
		long b = Long.parseLong(w);
		
		System.out.printf((a==b) ? "1" : "0");
		*/
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		
		long a = Long.parseLong(v);
		long b = Long.parseLong(w);
		
		System.out.printf((a!=b) ? "1" : "0");
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		int str = scan.nextInt();
		scan.close();
		
		System.out.printf((str == 1) ? "0" : "1");
		*/
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		
		long a = Long.parseLong(v);
		long b = Long.parseLong(w);
		
		System.out.printf((a == 0 && b == 0) ? "1" : "0");
		*/
		/*
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] dd = str.split(" ");
		
		String v = dd[0];
		String w = dd[1];
		
		int a = Integer.parseInt(v);
		int b = Integer.parseInt(w);
		
		System.out.printf("%d", ~str);
		*/
		/*
		Scanner scan = new Scanner(System.in);		
		
		String num = scan.nextLine();
		String num2 = scan.nextLine();
		String [] arr = num2.split(" ");
		
		int total[] = new int[23];
		
		for(int i = 0; i < arr.length; i++) {
			total[Integer.parseInt(arr[i])-1] +=1;
		}
		
		for(int i = 0; i < total.length; i++) {
			System.out.print(total[i]+" ");
		}
		*/
		/*
		
		Scanner scan = new Scanner(System.in);		
		
		String num = scan.nextLine();
		String num2 = scan.nextLine();
		String [] arr = num2.split(" ");
		
		int total = Integer.parseInt (num);
		int b = 25;
		
		for(int i = total-1; i >= 0; i--) {
			String a = arr[i];			
			int sum = Integer.parseInt(a);
			if(sum < b) {
				b = sum;
			} else {

			}
		}
		
		System.out.println(b);
		*/
		/*
		Scanner scan = new Scanner(System.in);		
		
		int x = scan.nextInt();
		int n = scan.nextInt();  
        long[] answer = new long [n];
		
		for (int i = 1; i <= n; i++) {
			if(i == 1) {
            answer[i-1] = x;
			} else {
			answer[i-1] = x * i;
			}
        }
		for (int j = 0; j <= answer.length; j++) {
		System.out.println(answer[j]);
		}
		*/
		
		/*
		
		for(int i = 1; i <= 100; i++) {
			System.out.printf("for 문을 %d회 실행했습니다.\n", i);
			if(i == 57) {
				break;
			}

		}
		
		System.out.println("for 문을 종료했습니다.");
		*/
		/*
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d;
		int hap;
		
		System.out.printf("1번째 숫자를 입력하세요. : ");
		a = scan.nextInt();
		System.out.printf("2번째 숫자를 입력하세요. : ");
		b = scan.nextInt();
		System.out.printf("3번째 숫자를 입력하세요. : ");
		c = scan.nextInt();
		System.out.printf("4번째 숫자를 입력하세요. : ");
		d = scan.nextInt();
		
		hap = a + b + c + d;
		
		System.out.printf("합계==> %d \n", hap);
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int a []= new int [4];
		int hap;
		
		System.out.printf("숫자를 입력하세요. : ");
		a[0] = scan.nextInt();
		System.out.printf("2번째 숫자를 입력하세요. : ");
		a[1] = scan.nextInt();
		System.out.printf("3번째 숫자를 입력하세요. : ");
		a[2] = scan.nextInt();
		System.out.printf("4번째 숫자를 입력하세요. : ");
		a[3] = scan.nextInt();
		
		hap = a[0] + a[1] + a[2] + a[3];
		
		System.out.printf("합계==> %d \n", hap);
		*/
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int a [] = new int [4];
		int hap = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요. : ", i+1);
			a[i] = scan.nextInt();
			hap += a[i];
		}
		
		
		System.out.printf("합계==> %d \n", hap);
		
		*/
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int aa [] = {10, 20, 30, 40, 50};
		int count, size;
		
		count= aa.length;
		size = count * Integer.BYTES;
		
		
		System.out.printf("배열 aa[]의 요소의 갯수는 %d개 입니다. \n", count);
		System.out.printf("배열 aa[]의 전채 크기는 %d바이트입니다. \n", size);
		*/
		/*
		int aa [][] = new int [3] [4];
		
		aa[0][0] = 1; aa[0][1] = 2; aa[0][2] = 3; aa[0][3] = 4;
		aa[1][0] = 5; aa[1][1] = 6; aa[1][2] = 7; aa[1][3] = 8;
		aa[2][0] = 9; aa[2][1] = 10; aa[2][2] = 11; aa[2][3] = 12;
		
		System.out.printf("%-3d %-3d %-3d %-3d\n",aa[0][0] ,aa[0][1],aa[0][2],aa[0][3]);
		System.out.printf("%-3d %-3d %-3d %-3d\n",aa[1][0] ,aa[1][1],aa[1][2],aa[1][3]);
		System.out.printf("%-3d %-3d %-3d %-3d\n",aa[2][0] ,aa[2][1],aa[2][2],aa[2][3]);
		*/
		/*
		int aa [][] = new int [3] [4];
		int val = 1;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				aa[i][j] = val;
				val++;
				System.out.printf("%-3d",aa[i][j]);
			}
			System.out.println();
		}
		*/
		/*
		int[][] a = new int[4][3];
	      int b; //무작위 값을 입력받을 변수
	      int c = 1; //도착시간 숫자에 조건을 주기 위해 만든 변수
	      System.out.println("     도착시간  작업시간");
	      
	      for(int i = 0; i<4; i++) {
	         a[i][0]=i+1; //p 뒤의 숫자가 1부터 들어가야되서 만든 변수 초기화
	         System.out.print("p"+a[i][0]);
	         for(int j=1; j<3; j++) { //j=0인 자리는 for(i)에서 다 입력해주었다.
	            b = (int)(Math.random()*50)+1; //1~50까지의 무작위 숫자 생성
	            if(i==0 && j==1) { //p1의 도착시간은 0이다.
	               System.out.printf("%4d",0);   
	            }else if(i== c && j==1){ //p2의 도착시간 설정
	               while(true) { //무한정돌린다. 내부속의 조건이 맞을떄 까지
	                  b = (int)(Math.random()*50)+1;
	                  if(b>a[i-1][1] && b<a[0][2]) { //이전 p보다 도착시간이 크고 p1의 작업시간보다 작아야된다.
	                     break;                  
	                  }
	               }
	               c++;
	               a[i][j]=b;
	               System.out.printf("%4d",a[i][j]);
	            }else {
	               a[i][j]=b;
	               System.out.printf("%6d",a[i][j]);
	            }
	         }
	         System.out.println();
	      }
*/
		  
		
		  
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
