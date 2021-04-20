package kcy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programers_make_prime_number {

	public static void main(String[] args) {
		
		int[] arr = {1,2,7,6,4};
		int a = solution(arr);
		System.out.println(a);
	}
	
    static List<Integer> cList = new ArrayList<Integer>();
    static int[] a = {};
    static boolean[] a_b = {};

    public static int solution(int[] nums) {
        int answer = 0;
        boolean[] arr = new boolean[nums.length];
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = false;
        }
        a = nums;
        a_b = arr;
        combination(0, 1);
        List<Integer> pList = cList;
        Iterator<Integer> it = pList.iterator();
        while(it.hasNext()) {
        	int num = it.next();
        	boolean primeNum = true;
        	for(int i = 2; i < num; i++) {
        		if(num % i == 0) {
        			primeNum = false;
        			break;
        		}
        	}
        	if(primeNum) {
        		answer++;
        	}
        }
        return answer;
    }

    //count(= 몇 개를 뽑을지). 그리고 index(= 숫자 뽑는데 쓰이는 Iterator 역할).
    public static  void combination(int index, int count)
    {
    	//4번째 재귀에 이 구문이 실행된다. 출력 후 재귀탈출. (뽑는건 세번째에서 끝)
        if(count==4) {
        	stack();
            return;
        }
        else {
            for(int z = index; z < a.length; z++) {
                if(a_b[z]) // 선택된 숫자는 무시
                    continue;
                else { //false일 경우
                    a_b[z] = true; // 선택되지 않은 숫자일 경우 선택하는 것.
                    combination(z+1, count+1); // 마지막으로 선택한 숫자 이후부터 다시 선택검사 시키도록.(뒤는 돌아보지 않음)
                    a_b[z] = false; // 해당 숫자에 대한 모든 조합이 끝나면 false, 그리고 다음 숫자로 이동시키는 것.
                }
            }
        }
    }
    
    public static void stack() {
    	List<Integer> pList = new ArrayList<Integer>();
        for(int i =0; i< a_b.length; i++) {
            if(a_b[i]) {
            	pList.add(a[i]);
            }
        }
        
        Iterator<Integer> it = pList.iterator();
        int[] addition = new int[3];
        int count = 0;
        while(it.hasNext()) {
        	
        	if(count == 2) {
        		addition[count] = it.next();
        		cList.add(addition[0]+addition[1]+addition[2]);
        		count = 0;
        	} else {
        		addition[count] = it.next();
        	}
        	count++;
        }
    }

}
