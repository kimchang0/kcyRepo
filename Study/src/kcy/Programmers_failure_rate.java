package kcy;

import java.util.HashMap;

public class Programmers_failure_rate {

	public static void main(String[] args) {
		
		
		
	}
	
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < stages.length; j++) {
            	if(stages[j] == i && stages[j] < i) {
            		
            	}
        	}
        }
        HashMap<String, Integer> duplicate_count = new HashMap<String, Integer>();
        for(int i = 0 ; i < duplicate_count.size() ; i++){
            if (duplicate_count.containsKey(duplicate_count.get(i))) {
                duplicate_count.put(duplicate_count.get(i), duplicate_count.get(duplicate_data.get(i))  + 1);
            } else {
                duplicate_count.put(duplicate_count.get(i) , 1);
            }
        }
        
        return answer;
    }
}
