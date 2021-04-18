package kcy;

public class Programers_sport_wear {

	public static void main(String[] args) {

		int n = 10;
		int[] lost = {4,5,6};
		int[] reserve = {3,4,5};
		
		int a = solution(n, lost, reserve);
		System.out.println(a);
		
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        for(int i = 0; i < lost.length; i++) {
        	for(int j = 0; j < reserve.length; j++) {
        		if(lost[i] == reserve[j]) {
        			lost[i] = -10;
        			reserve[j] = -10;
        			answer++;
        			break;
        		}
        	}
        }
        answer -= lost.length;
        
        for(int i = 0; i < lost.length; i++) {
        	for(int j = 0; j < reserve.length; j++) {
        		if(lost[i] == (reserve[j])-1) {
        			answer++;
        			reserve[j] = -10;
        			break;
        		}
        		if(lost[i] == (reserve[j])+1) {
        			answer++;
        			reserve[j] = -10;
        			break;
        		}
        	}
        }
        
        return answer;
    }

}
