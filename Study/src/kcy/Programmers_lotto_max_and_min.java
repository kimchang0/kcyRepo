package kcy;

import java.util.Arrays;

public class Programmers_lotto_max_and_min {
	
	public static void main(String[] args) {
		
		int[] arr1 = {45, 4, 35, 20, 3, 9};
		int[] arr2 = {20, 9, 3, 45, 4, 35};
		
		System.out.println(Arrays.toString(solution(arr1, arr2)));
		
	}
	
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int cnt = 0;
        int zcnt = 0;
        for(int i = 0; i < lottos.length; i++) {
        	for(int j = 0; j < lottos.length; j++) {
        		if(lottos[i] == win_nums[j]) {
            		cnt++;
            		break;
            	}
        	}
        	if(lottos[i] == 0) {
        		zcnt++;
        	}
        }
        int temp = 0;
        for(int i = 0; i < 2; i++) {
        	if(i == 0) {
        		temp = cnt + zcnt;
        	} else {
        		temp -= zcnt;
        	}
        	switch(temp) {
        	case 2:
        		answer[i] = 5;
        		break;
        	case 3:
        		answer[i] = 4;
        		break;
        	case 4:
        		answer[i] = 3;
        		break;
        	case 5:
        		answer[i] = 2;
        		break;
        	case 6:
        		answer[i] = 1;
        		break;
        	default:
        		answer[i] = 6;
        		break;
        	}
        	
        }
        
        return answer;
    }
}
