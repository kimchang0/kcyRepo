package kcy;

import java.util.Arrays;

public class Programmers_seceret_map {

	public static void main(String[] args) {
		
		//Integer.Binary 2진수 변환, toString으로 변환, split으로 나누고, 같으면 # 아니면 " "
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		int n = 5;
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean[] map1 = new boolean[n];
        boolean[] map2 = new boolean[n];
        
        
        for(int i = 0; i < arr1.length; i++) {

        	if((Integer.toBinaryString(arr1[i])).equals("1")){
        		map1[i] = true;
        	} else {
        		map1[i] = false;
        	}

        	if((Integer.toBinaryString(arr2[i])).equals("1")){
        		map2[i] = true;
        	} else {
        		map2[i] = false;
        	}
        	
        	answer[i] += map1[i] == true && map2[i] == true ? "#" : " ";
        }
        

        for(int i = 0; i < map1.length; i++) {
        	System.out.println(map1[i]);
        	System.out.println(map2[i]);
        	System.out.println(answer[i]);
        }
        
        return answer;
    }

}
