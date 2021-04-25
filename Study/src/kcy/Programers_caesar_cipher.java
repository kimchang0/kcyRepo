package kcy;

public class Programers_caesar_cipher {

	public static void main(String[] args) {
		
		String str = "AB";
		int num = 1;
		System.out.println(solution(str, num));
		
	}
	
    public static String solution(String s, int n) {
        String answer = "";
        
        String[] arr = s.split("");
        
        for(String a : arr) {
        	char cvt = a.charAt(0);
        	cvt += n;
        	answer += cvt;
        }
        
        return answer;
    }

}
