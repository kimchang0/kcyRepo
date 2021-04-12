package kcy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Programers_min_num_delete {
	static int tmp;
	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1};
		System.out.println(Arrays.toString(solution(arr)));
		
	}
	public static int[] solution(int[] arr) {
		
        int[] answer = {};
        tmp = arr[0];
        List<Integer> pList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
        	if(tmp > arr[i]) {
        		tmp = arr[i];
        	}
        	pList.add(arr[i]);
        }
        if(pList.size() == 1) {
        	pList.removeIf(i -> i == tmp);
        	pList.add(-1);
        } else {
        	pList.removeIf(i -> i == tmp);
        }
        
        Iterator<Integer> it = pList.iterator();
        int i = 0;
        answer = new int[pList.size()];
        while(it.hasNext()) {
        	answer[i] = (int) it.next();
        	i++;
        }
        return answer;
    }
}
