package kcy;

public class Programers_caesar_cipher {

	public static void main(String[] args) {
		
		String str = "a B z";
		int num = 4;
		System.out.println(solution(str, num));
		
	}
	
    public static String solution(String s, int n) {
        String answer = "";
        
        String[] arr = s.split("");
        boolean cases = false;
        
        for(String a : arr) {
        	char cvt = a.charAt(0);
        	if((int)cvt <= 90) {
        		cases = false;
        	} else {
        		cases = true;
        	}
        	System.out.println("n + before cvt: " + cvt);
        	if(cvt != ' ') {
        		cvt += n;
        	}
        	System.out.println("n + after cvt: " + cvt);
        	
        	if(cases) {
        		if((int)cvt > 122) {
        			System.out.println((int)cvt);
        			cvt -= 26;
        		}
        	} else {
        		if((int)cvt > 91) {
        			cvt -= 26;
        		}
        		
        	}
        	System.out.println(cvt);
        	answer += cvt;
        }
        
        return answer;
    }

}
