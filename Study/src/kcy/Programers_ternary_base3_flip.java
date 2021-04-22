package kcy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programers_ternary_base3_flip {

	public static void main(String[] args) throws NumberFormatException, IOException {
        
        int quotient = 15;
        int cardinalNum = 3;
        List<Integer> output = new ArrayList<>();
        
        while(quotient != 0) {
            output.add(quotient%cardinalNum); // 나머지가 저장됨
            quotient /= cardinalNum;
        }
        
        System.out.println(output);
    }
	
    public int solution(int n) {
        int answer = 0;
        
        
        return answer;
    }

}
