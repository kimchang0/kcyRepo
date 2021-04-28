package kcy;

import java.util.ArrayList;
import java.util.List;

public class Programers_least_common_multiple_and_Greatest_common_divisor {

	public static void main(String[] args) {

		
		
	}
	
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        List <Integer> lList = new ArrayList<>();
        List <Integer> rList = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		lList.add(i);
        	}
        }
        
        for(int i = 1; i <= m; i++) {
        	if(m % i == 0) {
        		rList.add(i);
        	}
        }
        
        for(int i = 0; i < lList.size(); i++) {
        	for(int j = 0; j < rList.size(); j++) {
        		if(lList.get(i) == rList.get(j) && answer[0] < rList.get(j)) {
        			answer[0] = rList.get(j);
        		}
        	}
        }
        
        return answer;
    }

}
