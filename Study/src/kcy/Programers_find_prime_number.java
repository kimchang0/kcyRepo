package kcy;

public class Programers_find_prime_number {
	public static void main(String[] args) {
		System.out.println(solution(5));
	}
	
	public static int solution(int n) {
		
		int answer = 0;
		// n+1��ŭ �Ҵ�
		boolean[] primeList = new boolean[n+1];
		// 0��°�� 1��°�� �Ҽ� �ƴ����� ó��
		primeList[0] = false;
		primeList[1] = false;
		// 2~ n ���� �Ҽ��� ����
		for(int i=2; i<=n; i++ ) {
			primeList[i] = true;
		}
		// 2 ����  ~ i*i <= n
		// ������ ������� ��������.
		for(int i=2; (i*i)<=n; i++){
			if(primeList[i]){
				for(int j = i*i; j<=n; j+=i) {
					primeList[j] = false;
				}
				//i*i �̸��� �̹� ó���Ǿ����Ƿ� j�� ���۰��� i*i�� ����ȭ�� �� �ִ�.
			}
		}
		
		for(int i = 0; i <=n; i++) {
			if(primeList[i] == true) {
				answer++;
			}
		}
		return answer;
	}
	
	/*
    public static int solution(int n) {
    	
    	boolean not_split_another_num = false;
        int answer = 0;
    	for(int i = 2; i <= n; i++) {
    		for(int j = 1; j < n; j++) {
    			if(i != j && j != 1 && i % j == 0) {
    				not_split_another_num = false;
    				break;
    			} else {
    				not_split_another_num = true;
    			}
    		}
    		if(not_split_another_num) {
    			System.out.println("i: " + i);
    			answer++;
    		}
    	}
        return answer;
    }
    */
}
