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

2����->10���� Integer.toBinaryString(int);
8����->10���� Integer.toOctalString(int);
16����->10���� Integer.toHexString(int);
10����->2���� Integer.valueOf(string, 2)
10����->8���� Integer.valueOf(string, 8)
10����->16���� Integer.valueOf(string, 16)

���ڿ�->?(2,8,10,16)���� ��ȯ (int��)
Integer.parseInt(str,?);

���ڿ�->?(2,8,10,16)���� ��ȯ (long��)
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
		
		//���߿��� ������
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
			System.out.printf("for ���� %dȸ �����߽��ϴ�.\n", i);
			if(i == 57) {
				break;
			}

		}
		
		System.out.println("for ���� �����߽��ϴ�.");
		*/
		/*
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d;
		int hap;
		
		System.out.printf("1��° ���ڸ� �Է��ϼ���. : ");
		a = scan.nextInt();
		System.out.printf("2��° ���ڸ� �Է��ϼ���. : ");
		b = scan.nextInt();
		System.out.printf("3��° ���ڸ� �Է��ϼ���. : ");
		c = scan.nextInt();
		System.out.printf("4��° ���ڸ� �Է��ϼ���. : ");
		d = scan.nextInt();
		
		hap = a + b + c + d;
		
		System.out.printf("�հ�==> %d \n", hap);
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int a []= new int [4];
		int hap;
		
		System.out.printf("���ڸ� �Է��ϼ���. : ");
		a[0] = scan.nextInt();
		System.out.printf("2��° ���ڸ� �Է��ϼ���. : ");
		a[1] = scan.nextInt();
		System.out.printf("3��° ���ڸ� �Է��ϼ���. : ");
		a[2] = scan.nextInt();
		System.out.printf("4��° ���ڸ� �Է��ϼ���. : ");
		a[3] = scan.nextInt();
		
		hap = a[0] + a[1] + a[2] + a[3];
		
		System.out.printf("�հ�==> %d \n", hap);
		*/
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int a [] = new int [4];
		int hap = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ���. : ", i+1);
			a[i] = scan.nextInt();
			hap += a[i];
		}
		
		
		System.out.printf("�հ�==> %d \n", hap);
		
		*/
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		int aa [] = {10, 20, 30, 40, 50};
		int count, size;
		
		count= aa.length;
		size = count * Integer.BYTES;
		
		
		System.out.printf("�迭 aa[]�� ����� ������ %d�� �Դϴ�. \n", count);
		System.out.printf("�迭 aa[]�� ��ä ũ��� %d����Ʈ�Դϴ�. \n", size);
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
	      int b; //������ ���� �Է¹��� ����
	      int c = 1; //�����ð� ���ڿ� ������ �ֱ� ���� ���� ����
	      System.out.println("     �����ð�  �۾��ð�");
	      
	      for(int i = 0; i<4; i++) {
	         a[i][0]=i+1; //p ���� ���ڰ� 1���� ���ߵǼ� ���� ���� �ʱ�ȭ
	         System.out.print("p"+a[i][0]);
	         for(int j=1; j<3; j++) { //j=0�� �ڸ��� for(i)���� �� �Է����־���.
	            b = (int)(Math.random()*50)+1; //1~50������ ������ ���� ����
	            if(i==0 && j==1) { //p1�� �����ð��� 0�̴�.
	               System.out.printf("%4d",0);   
	            }else if(i== c && j==1){ //p2�� �����ð� ����
	               while(true) { //������������. ���μ��� ������ ������ ����
	                  b = (int)(Math.random()*50)+1;
	                  if(b>a[i-1][1] && b<a[0][2]) { //���� p���� �����ð��� ũ�� p1�� �۾��ð����� �۾ƾߵȴ�.
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
