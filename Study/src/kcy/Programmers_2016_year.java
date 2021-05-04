package kcy;

public class Programmers_2016_year {

	public static void main(String[] args) {
		int a = 0;
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 1; i < 13; i++) {
			a = month[i-1];
			for(int j = 1; j <= a; j++) {
				System.out.print(i + "¿ù " + j + "ÀÏ ");
				System.out.println(solution(i, j));
			}
		}
		
		
	}
	
    public static String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        for(int i = 0; i < a-1; i++) {
        	b += month[i];
        }
        return day[b % 7];
    }
}
