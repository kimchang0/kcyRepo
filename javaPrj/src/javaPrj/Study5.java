package javaPrj;

public class Study5 {

	public static void main(String[] args) {
		//int res1 = new sum(1, 2);
		int res2 = sum(1, 2, 3);
		int res3 = sum(1, 2, 3, 4);
		
		//System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	
	}
	
	public int sum(int a,int b ) {
		return sum(a, b, 0, 0);
	}
	public static int sum(int a, int b, int c) {
		return sum(a, b, c, 0);
	}
	public static int sum(int a, int b, int c, int d) {
		int res = a + b + c + d;
		
		return res;
	}
}
