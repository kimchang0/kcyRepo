package javaPrj;

public class twoStar {

	public static void main(String[] args) {
	
		
		for (int i = 1; i < 8; i++) {
			for(int k = 0; k < 4; k++) {
				if(i <= 4) {
					System.out.print(k >= 4 - i ? "*" : " ");
				} else {
					System.out.print(k >= i - 4 ? "*" : " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------º°Âï±â----------");
		
		for(int i = 1; i < 5; i++) {
			for(int k = 1; k < 5; k++) {
				System.out.print(k >= 5 - i ? "*" : " ");
			}
			System.out.println();
		}
		for(int i = 1; i < 4; i++) {
			for(int k = 1; k < 5; k++) {
				System.out.print(k > i ? "*" : " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
