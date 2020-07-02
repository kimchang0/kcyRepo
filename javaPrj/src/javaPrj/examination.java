package javaPrj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class examination {

	public static void main(String[] args) {

		System.out.println("----------별찍기----------");
		
		for (int i = 1; i < 8; i++) {
			for(int k = 0; k < 4; k++) {
				if(i <= 4) {
					System.out.print(k >= 4 - i ? "*" : " ");
				} else {
					System.out.print(k >= i - 4 ? "*" : " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------배열 출력과 합----------");
		
		int hap = 0;
		int a[] = new int [90];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 11;
			hap += a[i];
		}
		
		int j = 0;
		
		while(j < a.length) {
			System.out.println("num[" + j + "] = " + a[j]);
			j++;
		}
		
		System.out.println("총 합: " + hap);
		
		System.out.println("----------for문 구구단----------");
		
		for(int i = 3; i < 9; i++) {
			if(i == 3 || i == 5) {
				System.out.printf("<%d단>\n", i);
			}
			for(int k = 1; k < 10; k++) {
				System.out.printf("%d * %d = %d\n", i, k, i * k);
			}
			System.out.println();
		}
		
		System.out.println("----------while문 구구단----------");
		
		int i, k;
		
		i = 3;
		while(i < 9) {
			if(i == 3 || i == 5) {
				System.out.printf("<%d단>\n", i);
			}
			k = 1;
			while(k < 10) {
				System.out.printf("%d * %d = %d\n", i, k, i * k);
				k++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("----------List 입력 iterator 출력----------");
		
		List <String> rList = new ArrayList<String>();
		
		rList.add("객체지향 프로그래밍");
		rList.add("하둡");
		rList.add("MongoDB");
		
		Iterator <String> it = rList.iterator(); 
		
		while(it.hasNext()) {
			String st = it.next();
			
			if(st.equals("객체지향 프로그래밍")) {
				System.out.println("<"+ st +">");
			} else {
				System.out.println(st);
			}
		}
		rList = null; //굳이 할 필요 없음
		it = null;
		
		System.out.println("----------Hash Map출력----------");
		
		List<Map<String, String>> RList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<String, String>();
		
		pMap.put("name", "이협건");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "서울");
		pMap.put("dept", "데분");
		
		RList.add(pMap);
		pMap = null;
		pMap = new HashMap<String, String>();
		
		pMap.put("name", "홍길동");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "경기");
		pMap.put("dept", "시각");
		
		RList.add(pMap);
		pMap = null;
		
		Iterator<Map<String, String>> li = RList.iterator();

		while(li.hasNext()) {
			Map<String, String> rMap = li.next();

			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));
			
			rMap = null;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
