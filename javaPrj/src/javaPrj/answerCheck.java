package javaPrj;

import java.util.Scanner;

public class answerCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 문제?");
		int a = scan.nextInt();
		int count = 0;
		
		int prob [] = new int [a];
		int answer [] = new int [a];
		
		System.out.println("정답을 입력하세요.");
		for(int i = 0; i < prob.length; i++) {
			prob[i] = scan.nextInt();
		}
		
		System.out.println("제출할 답을 입력하세요.");
		for(int i = 0; i < answer.length; i++) {
			answer[i] = scan.nextInt();
		}
		System.out.println();
		for(int i = 0; i < answer.length; i++) {
			if(prob[i] != answer[i]) {
				System.out.println((i+1) + "번 문제 틀림");
				System.out.println((i+1) + "번 답은 " + prob[i]);
				System.out.println("내가 제출한 "+ (i+1) + "번 답은 " + answer[i]);
				count++;
			} else {
				System.out.println((i+1) + "번 정답" );
			}
			
		}
		System.out.println(a + "개중에 " + count + "문제 틀림");
		System.out.println("정답률은 "+(100 - ((float) count /(float) a) * 100) + "%");
		
		
		
		
		
		

	}

}
