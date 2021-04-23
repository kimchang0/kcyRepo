package kcy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programers_ternary_base3_flip {

	public static void main(String[] args) throws NumberFormatException, IOException {
        

		int quotient = 15;
		System.out.println(solution(quotient));
    }
	
    public static int solution(int n) {
        int answer = 0;
        
        List<Integer> output = new ArrayList<>();
        
        while(n != 0) {
            output.add(n % 3); // 나머지가 저장됨
            n /= 3;
        }
        int three = 1;
        System.out.println(output);
        for(int i = output.size()-1; i >= 0; i--) {
        	answer += three * output.get(i);
        	System.out.println(answer);
        	three *= 3;
        }
        
        return answer;
    }

}
