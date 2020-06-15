package javaPrj;

import java.util.Scanner;

public class Programers2 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		String s = scan.nextLine();
		String [] ss = s.split("");
		boolean answer = true;
		int p = 0;
		int y = 0;
		
		for(int i = 0; i < ss.length; i++) {
			if(ss[i].equals("p")) {
				p++;
			} else if(ss[i].equals("P")) {
				p++;
			} else if(ss[i].equals("y")) {
				y++;
			} else if(ss[i].equals("Y")) {
				y++;
			}
		}
		if(p != y) {
			answer = false;
		}
		System.out.println(answer);
		
		
		
		
	}
}
