package javaPrj;

public class Study6 {

	public static void main(String[] args) {
		Study5 s5 = new Study5();
		int res1 = s5.sum(1, 2);
		int res2 = Study5.sum(1, 2, 3);
		int res3 = Study5.sum(1, 2, 3, 4);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
