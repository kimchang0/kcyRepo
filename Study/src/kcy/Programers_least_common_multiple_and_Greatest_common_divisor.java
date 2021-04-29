package kcy;

import java.util.Arrays;

public class Programers_least_common_multiple_and_Greatest_common_divisor {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(2, 5)));
		
	}
	
    public static int[] solution(int n, int m) {
        int[] answer = new int [2];
        
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        
        return answer;
    }
    
	static int gcd(int a, int b){ // �ִ�����
		while(b!=0){
			int r = a%b;
			a= b;
			b= r;
		}
		return a;
	}
	
	static int lcm(int a, int b){ // �ּ� �����
		// 0�� �ƴ� �� ���� �� / �� ���� �ִ�����
	    return a * b / gcd(a,b);
	}

}
