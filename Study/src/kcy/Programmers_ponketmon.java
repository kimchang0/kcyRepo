package kcy;

import java.util.HashSet;
import java.util.Set;

public class Programmers_ponketmon {

	public static void main(String[] args) {
		int[] arr = {3,3,3,2,2,2};
		System.out.println(solution(arr));
		
	}
	
    public static int solution(int[] nums) {
        Set<Integer> pSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
        	pSet.add(nums[i]);
        }
        if(pSet.size() > (nums.length/2)) {
        	return (nums.length / 2);
        } else {
        	return pSet.size();
        }
    }
}
