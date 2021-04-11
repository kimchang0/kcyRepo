package kcy;

public class Programers_bring_out_center_letter {

	public static void main(String[] args) {

		String s = "abcde";
		System.out.println(solution(s));
		System.out.println(solution2(s));
		
	}
	
    public static String solution(String s) {
    	
        String[] a = s.split("");
        s = "";
        
        if(a.length % 2 == 0) {
        	s += a[(a.length / 2) - 1] + a[(a.length / 2)];
        } else {
        	s += a[(a.length / 2)];
        }
        
        return s;
    }
	
	public static String solution2(String s) {
			
		return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
	}
}
