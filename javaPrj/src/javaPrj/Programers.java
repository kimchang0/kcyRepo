package javaPrj;

public class Programers {

	public static void main(String[] args) {
		

	
	
	System.out.println(solution(123406785));
	
	
	
	
	}
    public static int[] solution(long n) {
        int[] answer = {};
        long l = n;
        int count = 0;
        while(l != 0) {
            l /= 10;
            count++;
        }
        answer = new int [count];
        long b = 0;
        count = 0;
        while(n != 0) {
            b = n%10;
            answer[count] = (int) b;
            n /= 10;
            count++;
        }
        return answer;
    }
}
