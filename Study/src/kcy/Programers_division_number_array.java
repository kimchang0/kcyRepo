package kcy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Programers_division_number_array {

	public static void main(String[] args) {

		int[] arr = {3,2,6};
		int divisor = 1;
		System.out.println(Arrays.toString(solution(arr, divisor)));
		
	}

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        List<Integer> pList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		pList.add(arr[i]);
        	} else {
        		count++;
        	}
        }
        if(count == arr.length) {
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }
        answer = new int[pList.size()];
        Iterator<Integer> it = pList.iterator();
        int i = 0;
        while(it.hasNext()) {
        	answer[i] = it.next();
        	i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}
