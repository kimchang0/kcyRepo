package kcy;

public class Programers_caesar_cipher {

	public static void main(String[] args) {
		
		String str = "a B z";
		int num = 25;
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
        	
        	if(cvt != ' ') {
        		cvt += n;
        	}
        	
        	if(cases) {
        		while((int)cvt > 122) {
        			cvt -= 26;
        		}
        	} else {
        		while((int)cvt > 90) {
        			cvt -= 26;
        		}
        		
        	}
        	answer += cvt;
        }
        
        return answer;
    }

}