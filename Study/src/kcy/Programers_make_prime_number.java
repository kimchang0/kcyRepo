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

    //count(= �� ���� ������). �׸��� index(= ���� �̴µ� ���̴� Iterator ����).
    public static  void combination(int index, int count)
    {
    	//4��° ��Ϳ� �� ������ ����ȴ�. ��� �� ���Ż��. (�̴°� ����°���� ��)
        if(count==4) {
        	stack();
            return;
        }
        else {
            for(int z = index; z < a.length; z++) {
                if(a_b[z]) // ���õ� ���ڴ� ����
                    continue;
                else { //false�� ���
                    a_b[z] = true; // ���õ��� ���� ������ ��� �����ϴ� ��.
                    combination(z+1, count+1); // ���������� ������ ���� ���ĺ��� �ٽ� ���ð˻� ��Ű����.(�ڴ� ���ƺ��� ����)
                    a_b[z] = false; // �ش� ���ڿ� ���� ��� ������ ������ false, �׸��� ���� ���ڷ� �̵���Ű�� ��.
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
