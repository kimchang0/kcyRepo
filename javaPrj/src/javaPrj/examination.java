package javaPrj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class examination {

	public static void main(String[] args) {

		System.out.println("----------�����----------");
		
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
		
		System.out.println("----------�迭 ��°� ��----------");
		
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
		
		System.out.println("�� ��: " + hap);
		
		System.out.println("----------for�� ������----------");
		
		for(int i = 3; i < 9; i++) {
			if(i == 3 || i == 5) {
				System.out.printf("<%d��>\n", i);
			}
			for(int k = 1; k < 10; k++) {
				System.out.printf("%d * %d = %d\n", i, k, i * k);
			}
			System.out.println();
		}
		
		System.out.println("----------while�� ������----------");
		
		int i, k;
		
		i = 3;
		while(i < 9) {
			if(i == 3 || i == 5) {
				System.out.printf("<%d��>\n", i);
			}
			k = 1;
			while(k < 10) {
				System.out.printf("%d * %d = %d\n", i, k, i * k);
				k++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("----------List �Է� iterator ���----------");
		
		List <String> rList = new ArrayList<String>();
		
		rList.add("��ü���� ���α׷���");
		rList.add("�ϵ�");
		rList.add("MongoDB");
		
		Iterator <String> it = rList.iterator(); 
		
		while(it.hasNext()) {
			String st = it.next();
			
			if(st.equals("��ü���� ���α׷���")) {
				System.out.println("<"+ st +">");
			} else {
				System.out.println(st);
			}
		}
		rList = null; //���� �� �ʿ� ����
		it = null;
		
		System.out.println("----------Hash Map���----------");
		
		List<Map<String, String>> RList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<String, String>();
		
		pMap.put("name", "������");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "����");
		pMap.put("dept", "����");
		
		RList.add(pMap);
		pMap = null;
		pMap = new HashMap<String, String>();
		
		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "���");
		pMap.put("dept", "�ð�");
		
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
